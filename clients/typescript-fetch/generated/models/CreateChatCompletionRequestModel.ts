/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
 * @export
 * @interface CreateChatCompletionRequestModel
 */
export interface CreateChatCompletionRequestModel {
}

/**
 * Check if a given object implements the CreateChatCompletionRequestModel interface.
 */
export function instanceOfCreateChatCompletionRequestModel(value: object): value is CreateChatCompletionRequestModel {
    return true;
}

export function CreateChatCompletionRequestModelFromJSON(json: any): CreateChatCompletionRequestModel {
    return CreateChatCompletionRequestModelFromJSONTyped(json, false);
}

export function CreateChatCompletionRequestModelFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateChatCompletionRequestModel {
    return json;
}

  export function CreateChatCompletionRequestModelToJSON(json: any): CreateChatCompletionRequestModel {
      return CreateChatCompletionRequestModelToJSONTyped(json, false);
  }

  export function CreateChatCompletionRequestModelToJSONTyped(value?: CreateChatCompletionRequestModel | null, ignoreDiscriminator: boolean = false): any {
    return value;
}

