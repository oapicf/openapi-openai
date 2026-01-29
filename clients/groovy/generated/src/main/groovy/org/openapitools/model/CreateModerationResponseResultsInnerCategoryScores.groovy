package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CreateModerationResponseResultsInnerCategoryScores {
    /* The score for the category 'hate'. */
    BigDecimal hate
    /* The score for the category 'hate/threatening'. */
    BigDecimal hateThreatening
    /* The score for the category 'harassment'. */
    BigDecimal harassment
    /* The score for the category 'harassment/threatening'. */
    BigDecimal harassmentThreatening
    /* The score for the category 'self-harm'. */
    BigDecimal selfHarm
    /* The score for the category 'self-harm/intent'. */
    BigDecimal selfHarmIntent
    /* The score for the category 'self-harm/instructions'. */
    BigDecimal selfHarmInstructions
    /* The score for the category 'sexual'. */
    BigDecimal sexual
    /* The score for the category 'sexual/minors'. */
    BigDecimal sexualMinors
    /* The score for the category 'violence'. */
    BigDecimal violence
    /* The score for the category 'violence/graphic'. */
    BigDecimal violenceGraphic
}
