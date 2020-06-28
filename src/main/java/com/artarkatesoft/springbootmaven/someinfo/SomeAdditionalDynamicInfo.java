package com.artarkatesoft.springbootmaven.someinfo;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SomeAdditionalDynamicInfo implements InfoContributor {
    private static int dynamicVar=0;
    @Override
    public void contribute(Info.Builder builder) {

        dynamicVar++;
        Map<String, Object> detailsMap = new HashMap<>();
        detailsMap.put("dynamicVar",dynamicVar);
        detailsMap.put("staticVar","Some static info");
        builder.withDetails(detailsMap);
        Map<String,String> anotherInfoMap = new HashMap<>();
        anotherInfoMap.put("prop1Key","prop1Val");
        anotherInfoMap.put("prop2Key","prop2Val");

        builder.withDetail("anotherInfoMap",anotherInfoMap);
    }
}
