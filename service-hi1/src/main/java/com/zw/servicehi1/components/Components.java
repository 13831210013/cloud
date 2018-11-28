package com.zw.servicehi1.components;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Components {

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }


    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
