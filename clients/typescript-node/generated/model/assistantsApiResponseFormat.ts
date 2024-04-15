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
* An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
*/
export class AssistantsApiResponseFormat {
    /**
    * Must be one of `text` or `json_object`.
    */
    'type'?: AssistantsApiResponseFormat.TypeEnum = AssistantsApiResponseFormat.TypeEnum.Text;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "AssistantsApiResponseFormat.TypeEnum"
        }    ];

    static getAttributeTypeMap() {
        return AssistantsApiResponseFormat.attributeTypeMap;
    }
}

export namespace AssistantsApiResponseFormat {
    export enum TypeEnum {
        Text = <any> 'text',
        JsonObject = <any> 'json_object'
    }
}