package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BatchErrorsDataInner;

@Canonical
class BatchErrors {
    /* The object type, which is always `list`. */
    String _object
    
    List<BatchErrorsDataInner> data = new ArrayList<>()
}
