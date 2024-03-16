package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CreateImageRequest {
    /* A text description of the desired image(s). The maximum length is 1000 characters. */
    String prompt
    /* The number of images to generate. Must be between 1 and 10. */
    Integer n = 1

    enum SizeEnum {
    
        _256X256("256x256"),
        
        _512X512("512x512"),
        
        _1024X1024("1024x1024")
    
        private final String value
    
        SizeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. */
    SizeEnum size = SizeEnum._1024X1024

    enum ResponseFormatEnum {
    
        URL("url"),
        
        B64_JSON("b64_json")
    
        private final String value
    
        ResponseFormatEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. */
    ResponseFormatEnum responseFormat = ResponseFormatEnum.URL
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    String user
}
