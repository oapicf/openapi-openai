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

import { RequestFile } from './models';

export class CreateModerationResponseResultsInnerCategoryScores {
    'hate': number;
    'hateThreatening': number;
    'selfHarm': number;
    'sexual': number;
    'sexualMinors': number;
    'violence': number;
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
            "name": "selfHarm",
            "baseName": "self-harm",
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

