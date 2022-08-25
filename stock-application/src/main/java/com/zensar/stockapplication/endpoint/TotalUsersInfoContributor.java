package com.zensar.stockapplication.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
//import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
//import org.springframework.boot.actuate.info.InfoBuilder;
@Component
public class TotalUsersInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Integer> userDetails = new HashMap<>();
        userDetails.put("active", 10);
        userDetails.put("inactive", 20);

        builder.withDetail("users", userDetails);
    }

	
}
