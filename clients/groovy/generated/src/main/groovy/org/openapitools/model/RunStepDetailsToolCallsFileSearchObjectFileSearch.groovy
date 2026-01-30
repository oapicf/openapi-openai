package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObject;

@Canonical
class RunStepDetailsToolCallsFileSearchObjectFileSearch {
    
    RunStepDetailsToolCallsFileSearchRankingOptionsObject rankingOptions
    /* The results of the file search. */
    List<RunStepDetailsToolCallsFileSearchResultObject> results = new ArrayList<>()
}
