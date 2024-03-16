package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Model;

@Canonical
class ListModelsResponse {
    
    String _object
    
    List<Model> data = new ArrayList<>()
}
