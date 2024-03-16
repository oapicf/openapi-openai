// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface Model
 */
export interface Model  {
    /**
     * 
     * @type {string}
     * @memberof Model
     */
    id: string;
    /**
     * 
     * @type {string}
     * @memberof Model
     */
    object: string;
    /**
     * 
     * @type {number}
     * @memberof Model
     */
    created: number;
    /**
     * 
     * @type {string}
     * @memberof Model
     */
    ownedBy: string;
}

export function ModelFromJSON(json: any): Model {
    return {
        'id': json['id'],
        'object': json['object'],
        'created': json['created'],
        'ownedBy': json['owned_by'],
    };
}

export function ModelToJSON(value?: Model): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'object': value.object,
        'created': value.created,
        'owned_by': value.ownedBy,
    };
}


