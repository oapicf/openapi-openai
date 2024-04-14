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
import { CreateEmbeddingRequest } from '../model/createEmbeddingRequest';
import { CreateEmbeddingResponse } from '../model/createEmbeddingResponse';
import { Configuration } from '../configuration';


@Injectable()
export class EmbeddingsService {

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
     * Creates an embedding vector representing the input text.
     * 
     * @param createEmbeddingRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest, ): Observable<AxiosResponse<CreateEmbeddingResponse>>;
    public createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest, ): Observable<any> {

        if (createEmbeddingRequest === null || createEmbeddingRequest === undefined) {
            throw new Error('Required parameter createEmbeddingRequest was null or undefined when calling createEmbedding.');
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
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<CreateEmbeddingResponse>(`${this.basePath}/embeddings`,
            createEmbeddingRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
