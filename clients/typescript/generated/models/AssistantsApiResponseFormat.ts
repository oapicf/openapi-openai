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

import { HttpFile } from '../http/http';

/**
* An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
*/
export class AssistantsApiResponseFormat {
    /**
    * Must be one of `text` or `json_object`.
    */
    'type'?: AssistantsApiResponseFormatTypeEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "AssistantsApiResponseFormatTypeEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AssistantsApiResponseFormat.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum AssistantsApiResponseFormatTypeEnum {
    Text = 'text',
    JsonObject = 'json_object'
}

