package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantToolsFileSearchFileSearch;

@Canonical
class AssistantToolsFileSearch {

    enum TypeEnum {
    
        FILE_SEARCH("file_search")
    
        private final String value
    
        TypeEnum(String value) {
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

    /* The type of tool being defined: `file_search` */
    TypeEnum type
    
    AssistantToolsFileSearchFileSearch fileSearch
}
