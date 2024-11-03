package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class Embedding {
    /* The index of the embedding in the list of embeddings. */
    Integer index
    /* The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  */
    List<BigDecimal> embedding = new ArrayList<>()

    enum ObjectEnum {
    
        EMBEDDING("embedding")
    
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

    /* The object type, which is always \"embedding\". */
    ObjectEnum _object
}
