package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateModerationResponseResultsInnerCategories {
    /* Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. */
    Boolean hate
    /* Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. */
    Boolean hateThreatening
    /* Content that expresses, incites, or promotes harassing language towards any target. */
    Boolean harassment
    /* Harassment content that also includes violence or serious harm towards any target. */
    Boolean harassmentThreatening
    /* Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. */
    Boolean selfHarm
    /* Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. */
    Boolean selfHarmIntent
    /* Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. */
    Boolean selfHarmInstructions
    /* Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). */
    Boolean sexual
    /* Sexual content that includes an individual who is under 18 years old. */
    Boolean sexualMinors
    /* Content that depicts death, violence, or physical injury. */
    Boolean violence
    /* Content that depicts death, violence, or physical injury in graphic detail. */
    Boolean violenceGraphic
}
