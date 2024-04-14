/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

/**
* A list of the categories along with their scores as predicted by model.
*/
export class CreateModerationResponseResultsInnerCategoryScores {
    /**
    * The score for the category \'hate\'.
    */
    'hate': number;
    /**
    * The score for the category \'hate/threatening\'.
    */
    'hateThreatening': number;
    /**
    * The score for the category \'harassment\'.
    */
    'harassment': number;
    /**
    * The score for the category \'harassment/threatening\'.
    */
    'harassmentThreatening': number;
    /**
    * The score for the category \'self-harm\'.
    */
    'selfHarm': number;
    /**
    * The score for the category \'self-harm/intent\'.
    */
    'selfHarmIntent': number;
    /**
    * The score for the category \'self-harm/instructions\'.
    */
    'selfHarmInstructions': number;
    /**
    * The score for the category \'sexual\'.
    */
    'sexual': number;
    /**
    * The score for the category \'sexual/minors\'.
    */
    'sexualMinors': number;
    /**
    * The score for the category \'violence\'.
    */
    'violence': number;
    /**
    * The score for the category \'violence/graphic\'.
    */
    'violenceGraphic': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "hate",
            "baseName": "hate",
            "type": "number"
        },
        {
            "name": "hateThreatening",
            "baseName": "hate/threatening",
            "type": "number"
        },
        {
            "name": "harassment",
            "baseName": "harassment",
            "type": "number"
        },
        {
            "name": "harassmentThreatening",
            "baseName": "harassment/threatening",
            "type": "number"
        },
        {
            "name": "selfHarm",
            "baseName": "self-harm",
            "type": "number"
        },
        {
            "name": "selfHarmIntent",
            "baseName": "self-harm/intent",
            "type": "number"
        },
        {
            "name": "selfHarmInstructions",
            "baseName": "self-harm/instructions",
            "type": "number"
        },
        {
            "name": "sexual",
            "baseName": "sexual",
            "type": "number"
        },
        {
            "name": "sexualMinors",
            "baseName": "sexual/minors",
            "type": "number"
        },
        {
            "name": "violence",
            "baseName": "violence",
            "type": "number"
        },
        {
            "name": "violenceGraphic",
            "baseName": "violence/graphic",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CreateModerationResponseResultsInnerCategoryScores.attributeTypeMap;
    }
}

