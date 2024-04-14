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
* The function definition.
*/
export class RunToolCallObjectFunction {
    /**
    * The name of the function.
    */
    'name': string;
    /**
    * The arguments that the model expects you to pass to the function.
    */
    'arguments': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "arguments",
            "baseName": "arguments",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return RunToolCallObjectFunction.attributeTypeMap;
    }
}

