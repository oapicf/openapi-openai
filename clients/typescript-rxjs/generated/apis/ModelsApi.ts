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
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders } from '../runtime';
import type {
    DeleteModelResponse,
    ListModelsResponse,
    Model,
} from '../models';

export interface DeleteModelRequest {
    model: string;
}

export interface RetrieveModelRequest {
    model: string;
}

/**
 * no description
 */
export class ModelsApi extends BaseAPI {

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     */
    deleteModel({ model }: DeleteModelRequest): Observable<DeleteModelResponse>
    deleteModel({ model }: DeleteModelRequest, opts?: OperationOpts): Observable<AjaxResponse<DeleteModelResponse>>
    deleteModel({ model }: DeleteModelRequest, opts?: OperationOpts): Observable<DeleteModelResponse | AjaxResponse<DeleteModelResponse>> {
        throwIfNullOrUndefined(model, 'model', 'deleteModel');

        const headers: HttpHeaders = {
        };

        return this.request<DeleteModelResponse>({
            url: '/models/{model}'.replace('{model}', encodeURI(model)),
            method: 'DELETE',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    listModels(): Observable<ListModelsResponse>
    listModels(opts?: OperationOpts): Observable<AjaxResponse<ListModelsResponse>>
    listModels(opts?: OperationOpts): Observable<ListModelsResponse | AjaxResponse<ListModelsResponse>> {
        const headers: HttpHeaders = {
        };

        return this.request<ListModelsResponse>({
            url: '/models',
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     */
    retrieveModel({ model }: RetrieveModelRequest): Observable<Model>
    retrieveModel({ model }: RetrieveModelRequest, opts?: OperationOpts): Observable<AjaxResponse<Model>>
    retrieveModel({ model }: RetrieveModelRequest, opts?: OperationOpts): Observable<Model | AjaxResponse<Model>> {
        throwIfNullOrUndefined(model, 'model', 'retrieveModel');

        const headers: HttpHeaders = {
        };

        return this.request<Model>({
            url: '/models/{model}'.replace('{model}', encodeURI(model)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

}
