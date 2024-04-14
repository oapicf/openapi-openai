package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateModerationResponseResultsInner;

@Canonical
class CreateModerationResponse {
    /* The unique identifier for the moderation request. */
    String id
    /* The model used to generate the moderation results. */
    String model
    /* A list of moderation objects. */
    List<CreateModerationResponseResultsInner> results = new ArrayList<>()
}
