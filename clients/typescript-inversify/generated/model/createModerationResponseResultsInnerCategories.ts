/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface CreateModerationResponseResultsInnerCategories { 
    hate: boolean;
    hate_threatening: boolean;
    self_harm: boolean;
    sexual: boolean;
    sexual_minors: boolean;
    violence: boolean;
    violence_graphic: boolean;
}
