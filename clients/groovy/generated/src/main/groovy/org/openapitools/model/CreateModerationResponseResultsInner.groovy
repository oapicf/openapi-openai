package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;

@Canonical
class CreateModerationResponseResultsInner {
    /* Whether any of the below categories are flagged. */
    Boolean flagged
    
    CreateModerationResponseResultsInnerCategories categories
    
    CreateModerationResponseResultsInnerCategoryScores categoryScores
}
