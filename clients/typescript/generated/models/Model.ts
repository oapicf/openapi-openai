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
* Describes an OpenAI model offering that can be used with the API.
*/
export class Model {
    /**
    * The model identifier, which can be referenced in the API endpoints.
    */
    'id': string;
    /**
    * The Unix timestamp (in seconds) when the model was created.
    */
    'created': number;
    /**
    * The object type, which is always \"model\".
    */
    'object': ModelObjectEnum;
    /**
    * The organization that owns the model.
    */
    'ownedBy': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "created",
            "baseName": "created",
            "type": "number",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "ModelObjectEnum",
            "format": ""
        },
        {
            "name": "ownedBy",
            "baseName": "owned_by",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Model.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum ModelObjectEnum {
    Model = 'model'
}

