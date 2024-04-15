/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CreateModerationResponseResultsInnerCategories } from '../models/CreateModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryScores } from '../models/CreateModerationResponseResultsInnerCategoryScores';
import { HttpFile } from '../http/http';

export class CreateModerationResponseResultsInner {
    /**
    * Whether any of the below categories are flagged.
    */
    'flagged': boolean;
    'categories': CreateModerationResponseResultsInnerCategories;
    'categoryScores': CreateModerationResponseResultsInnerCategoryScores;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "flagged",
            "baseName": "flagged",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "categories",
            "baseName": "categories",
            "type": "CreateModerationResponseResultsInnerCategories",
            "format": ""
        },
        {
            "name": "categoryScores",
            "baseName": "category_scores",
            "type": "CreateModerationResponseResultsInnerCategoryScores",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateModerationResponseResultsInner.attributeTypeMap;
    }

    public constructor() {
    }
}
