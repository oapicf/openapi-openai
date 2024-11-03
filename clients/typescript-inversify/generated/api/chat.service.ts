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

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { CreateChatCompletionRequest } from '../model/createChatCompletionRequest';
import { CreateChatCompletionResponse } from '../model/createChatCompletionResponse';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class ChatService {
    private basePath: string = 'https://api.openai.com/v1';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Creates a model response for the given chat conversation.
     * 
     * @param createChatCompletionRequest 
     
     */
    public createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, observe?: 'body', headers?: Headers): Observable<CreateChatCompletionResponse>;
    public createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<CreateChatCompletionResponse>>;
    public createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (createChatCompletionRequest === null || createChatCompletionRequest === undefined){
            throw new Error('Required parameter createChatCompletionRequest was null or undefined when calling createChatCompletion.');
        }

        // authentication (ApiKeyAuth) required
        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<CreateChatCompletionResponse>> = this.httpClient.post(`${this.basePath}/chat/completions`, createChatCompletionRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <CreateChatCompletionResponse>(httpResponse.response))
               );
        }
        return response;
    }

}
