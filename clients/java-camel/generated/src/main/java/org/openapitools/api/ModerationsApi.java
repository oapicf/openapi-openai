/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class ModerationsApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        POST /moderations : Classifies if text is potentially harmful.
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .post("/moderations")
                .description("Classifies if text is potentially harmful.")
                .id("createModerationApi")
                .produces("application/json")
                .outType(CreateModerationResponse.class)
                .consumes("application/json")
                .type(CreateModerationRequest.class)
                
                .param()
                    .name("createModerationRequest")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:createModeration");
        
    }
}
