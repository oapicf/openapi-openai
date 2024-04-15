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

import { CreateModerationResponseResultsInner } from '../models/CreateModerationResponseResultsInner';
import { HttpFile } from '../http/http';

/**
* Represents if a given text input is potentially harmful.
*/
export class CreateModerationResponse {
    /**
    * The unique identifier for the moderation request.
    */
    'id': string;
    /**
    * The model used to generate the moderation results.
    */
    'model': string;
    /**
    * A list of moderation objects.
    */
    'results': Array<CreateModerationResponseResultsInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "string",
            "format": ""
        },
        {
            "name": "results",
            "baseName": "results",
            "type": "Array<CreateModerationResponseResultsInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateModerationResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
