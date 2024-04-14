// tslint:disable
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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    CreateChatCompletionRequest,
    CreateChatCompletionRequestFromJSON,
    CreateChatCompletionRequestToJSON,
    CreateChatCompletionResponse,
    CreateChatCompletionResponseFromJSON,
    CreateChatCompletionResponseToJSON,
} from '../models';

export interface CreateChatCompletionRequest {
    createChatCompletionRequest: CreateChatCompletionRequest;
}


/**
 * Creates a model response for the given chat conversation.
 */
function createChatCompletionRaw<T>(requestParameters: CreateChatCompletionRequest, requestConfig: runtime.TypedQueryConfig<T, CreateChatCompletionResponse> = {}): QueryConfig<T> {
    if (requestParameters.createChatCompletionRequest === null || requestParameters.createChatCompletionRequest === undefined) {
        throw new runtime.RequiredError('createChatCompletionRequest','Required parameter requestParameters.createChatCompletionRequest was null or undefined when calling createChatCompletion.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/chat/completions`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters || CreateChatCompletionRequestToJSON(requestParameters.createChatCompletionRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CreateChatCompletionResponseFromJSON(body), text);
    }

    return config;
}

/**
* Creates a model response for the given chat conversation.
*/
export function createChatCompletion<T>(requestParameters: CreateChatCompletionRequest, requestConfig?: runtime.TypedQueryConfig<T, CreateChatCompletionResponse>): QueryConfig<T> {
    return createChatCompletionRaw(requestParameters, requestConfig);
}

