package ru.nsu.crpo.auth.service.core.feing.transportation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nsu.crpo.auth.service.core.feing.transportation.dto.PostCarrierRequest;
import ru.nsu.crpo.auth.service.core.feing.transportation.dto.PostConsignerRequest;

@FeignClient(name = "transportationServiceFeignClient")
public interface TransportationFeignClient {

    @PostMapping("/consigner")
    void createConsigner(PostConsignerRequest request);

    @PostMapping("/carrier")
    void createCarrier(PostCarrierRequest request);
}
