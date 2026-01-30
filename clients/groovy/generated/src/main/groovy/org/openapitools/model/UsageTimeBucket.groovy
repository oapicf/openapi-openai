package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UsageTimeBucketResultInner;

@Canonical
class UsageTimeBucket {

    enum ObjectEnum {
    
        BUCKET("bucket")
    
        private final String value
    
        ObjectEnum(String value) {
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

    
    ObjectEnum _object
    
    Integer startTime
    
    Integer endTime
    
    List<UsageTimeBucketResultInner> result = new ArrayList<>()
}
