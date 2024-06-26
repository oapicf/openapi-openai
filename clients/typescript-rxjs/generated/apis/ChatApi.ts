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

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined } from '../runtime';
import type { OperationOpts, HttpHeaders } from '../runtime';
import type {
    CreateChatCompletionRequest,
    CreateChatCompletionResponse,
} from '../models';

export interface CreateChatCompletionRequest {
    createChatCompletionRequest: CreateChatCompletionRequest;
}

/**
 * no description
 */
export class ChatApi extends BaseAPI {

    /**
     * Creates a model response for the given chat conversation.
     */
    createChatCompletion({ createChatCompletionRequest }: CreateChatCompletionRequest): Observable<CreateChatCompletionResponse>
    createChatCompletion({ createChatCompletionRequest }: CreateChatCompletionRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateChatCompletionResponse>>
    createChatCompletion({ createChatCompletionRequest }: CreateChatCompletionRequest, opts?: OperationOpts): Observable<CreateChatCompletionResponse | AjaxResponse<CreateChatCompletionResponse>> {
        throwIfNullOrUndefined(createChatCompletionRequest, 'createChatCompletionRequest', 'createChatCompletion');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<CreateChatCompletionResponse>({
            url: '/chat/completions',
            method: 'POST',
            headers,
            body: createChatCompletionRequest,
        }, opts?.responseOpts);
    };

}
