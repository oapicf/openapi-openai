package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FineTunePreferenceRequestInputInput;
import org.openapitools.model.FineTunePreferenceRequestInputPreferredCompletionInner;

@Canonical
class FineTunePreferenceRequestInput {
    
    FineTunePreferenceRequestInputInput input
    /* The preferred completion message for the output. */
    List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion = new ArrayList<>()
    /* The non-preferred completion message for the output. */
    List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion = new ArrayList<>()
}
