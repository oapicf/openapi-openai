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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable } from 'rxjs';
import { DeleteModelResponse } from '../model/deleteModelResponse';
import { ListModelsResponse } from '../model/listModelsResponse';
import { Model } from '../model/model';
import { Configuration } from '../configuration';


@Injectable()
export class ModelsService {

    protected basePath = 'https://api.openai.com/v1';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * 
     * @param model The model to delete
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteModel(model: string, ): Observable<AxiosResponse<DeleteModelResponse>>;
    public deleteModel(model: string, ): Observable<any> {

        if (model === null || model === undefined) {
            throw new Error('Required parameter model was null or undefined when calling deleteModel.');
        }

        let headers = {...this.defaultHeaders};

        // authentication (ApiKeyAuth) required
        if (typeof this.configuration.accessToken === 'function') {
            headers['Authorization'] = `Bearer ${this.configuration.accessToken()}`;
        } else if (this.configuration.accessToken) {
            headers['Authorization'] = `Bearer ${this.configuration.accessToken}`;
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.delete<DeleteModelResponse>(`${this.basePath}/models/${encodeURIComponent(String(model))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public listModels(): Observable<AxiosResponse<ListModelsResponse>>;
    public listModels(): Observable<any> {

        let headers = {...this.defaultHeaders};

        // authentication (ApiKeyAuth) required
        if (typeof this.configuration.accessToken === 'function') {
            headers['Authorization'] = `Bearer ${this.configuration.accessToken()}`;
        } else if (this.configuration.accessToken) {
            headers['Authorization'] = `Bearer ${this.configuration.accessToken}`;
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<ListModelsResponse>(`${this.basePath}/models`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * 
     * @param model The ID of the model to use for this request
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public retrieveModel(model: string, ): Observable<AxiosResponse<Model>>;
    public retrieveModel(model: string, ): Observable<any> {

        if (model === null || model === undefined) {
            throw new Error('Required parameter model was null or undefined when calling retrieveModel.');
        }

        let headers = {...this.defaultHeaders};

        // authentication (ApiKeyAuth) required
        if (typeof this.configuration.accessToken === 'function') {
            headers['Authorization'] = `Bearer ${this.configuration.accessToken()}`;
        } else if (this.configuration.accessToken) {
            headers['Authorization'] = `Bearer ${this.configuration.accessToken}`;
        }
        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<Model>(`${this.basePath}/models/${encodeURIComponent(String(model))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
