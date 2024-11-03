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

import * as models from './models';

export interface ListModelsResponse {
    object: ListModelsResponse.ObjectEnum;

    data: Array<models.Model>;

}
export namespace ListModelsResponse {
    export enum ObjectEnum {
        List = <any> 'list'
    }
}
