package com.webservice.sprinboot.Endpoints;

import com.webservice.sprinboot.repository.StoreRepository;
import com.webservice.sprinboot.ws.GetStoreRequest;
import com.webservice.sprinboot.ws.GetStoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StoreEndpoint {

    private static final String NAMESPACE_URI = "http://webservice.com/springboot";

    private final StoreRepository storeRepository;

    @Autowired
    public StoreEndpoint(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStoreRequest")
    @ResponsePayload
    public GetStoreResponse getStore(@RequestPayload GetStoreRequest request) {
        GetStoreResponse response = new GetStoreResponse();
        response.setStore(storeRepository.findStore(request.getId()));
        return response;
    }

}
