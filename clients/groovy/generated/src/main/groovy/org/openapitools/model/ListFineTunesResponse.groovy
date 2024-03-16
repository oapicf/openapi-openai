package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FineTune;

@Canonical
class ListFineTunesResponse {
    
    String _object
    
    List<FineTune> data = new ArrayList<>()
}
