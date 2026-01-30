package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;

@Canonical
class RunStepDetailsToolCallsFileSearchResultObject {
    /* The ID of the file that result was found in. */
    String fileId
    /* The name of the file that result was found in. */
    String fileName
    /* The score of the result. All values must be a floating point number between 0 and 1. */
    BigDecimal score
    /* The content of the result that was found. The content is only included if requested via the include query parameter. */
    List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>()
}
