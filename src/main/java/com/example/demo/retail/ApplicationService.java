package com.example.demo.retail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    public void CreateApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public ApplicationModel createRetailApplication(ApplicationRequest request){
        ApplicationModel r = new ApplicationModel();
        r.setName(request.getName());
        r.setSurname(request.getSurname());
        r.setIdentityNumber(request.getIdentityNumber());
        r.setAddress(request.getAddress());
        r.setEmail(request.getEmail());
        r.setPhone(request.getPhone());
        r.setBirthDay(request.getBirthDay());
        r.setDidRetail(request.getDidRetail());
        r.setWhyUs(request.getWhyUs());
        r.setLocation(request.getLocation());
        r.setEquityAmount(request.getEquityAmount());
        r.setAdditionalInformation(request.getAdditionalInformation());

        return applicationRepository.save(r);
    }
}
