package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OpenAIFile {
    /* The file identifier, which can be referenced in the API endpoints. */
    String id
    /* The size of the file, in bytes. */
    Integer bytes
    /* The Unix timestamp (in seconds) for when the file was created. */
    Integer createdAt
    /* The name of the file. */
    String filename

    enum ObjectEnum {
    
        FILE("file")
    
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

    /* The object type, which is always `file`. */
    ObjectEnum _object

    enum PurposeEnum {
    
        FINE_TUNE("fine-tune"),
        
        FINE_TUNE_RESULTS("fine-tune-results"),
        
        ASSISTANTS("assistants"),
        
        ASSISTANTS_OUTPUT("assistants_output")
    
        private final String value
    
        PurposeEnum(String value) {
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

    /* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. */
    PurposeEnum purpose

    enum StatusEnum {
    
        UPLOADED("uploaded"),
        
        PROCESSED("processed"),
        
        ERROR("error")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. */
    StatusEnum status
    /* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */
    String statusDetails
}
