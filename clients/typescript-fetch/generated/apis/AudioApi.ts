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


import * as runtime from '../runtime';
import type {
  CreateSpeechRequest,
  CreateTranscription200Response,
  CreateTranscriptionRequestModel,
  CreateTranslation200Response,
} from '../models/index';
import {
    CreateSpeechRequestFromJSON,
    CreateSpeechRequestToJSON,
    CreateTranscription200ResponseFromJSON,
    CreateTranscription200ResponseToJSON,
    CreateTranscriptionRequestModelFromJSON,
    CreateTranscriptionRequestModelToJSON,
    CreateTranslation200ResponseFromJSON,
    CreateTranslation200ResponseToJSON,
} from '../models/index';

export interface CreateSpeechOperationRequest {
    createSpeechRequest: CreateSpeechRequest;
}

export interface CreateTranscriptionRequest {
    file: Blob;
    model: CreateTranscriptionRequestModel;
    language?: string;
    prompt?: string;
    responseFormat?: CreateTranscriptionResponseFormatEnum;
    temperature?: number;
    timestampGranularities?: Array<CreateTranscriptionTimestampGranularitiesEnum>;
}

export interface CreateTranslationRequest {
    file: Blob;
    model: CreateTranscriptionRequestModel;
    prompt?: string;
    responseFormat?: string;
    temperature?: number;
}

/**
 * 
 */
export class AudioApi extends runtime.BaseAPI {

    /**
     * Generates audio from the input text.
     */
    async createSpeechRaw(requestParameters: CreateSpeechOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Blob>> {
        if (requestParameters['createSpeechRequest'] == null) {
            throw new runtime.RequiredError(
                'createSpeechRequest',
                'Required parameter "createSpeechRequest" was null or undefined when calling createSpeech().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/audio/speech`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CreateSpeechRequestToJSON(requestParameters['createSpeechRequest']),
        }, initOverrides);

        return new runtime.BlobApiResponse(response);
    }

    /**
     * Generates audio from the input text.
     */
    async createSpeech(requestParameters: CreateSpeechOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Blob> {
        const response = await this.createSpeechRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Transcribes audio into the input language.
     */
    async createTranscriptionRaw(requestParameters: CreateTranscriptionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CreateTranscription200Response>> {
        if (requestParameters['file'] == null) {
            throw new runtime.RequiredError(
                'file',
                'Required parameter "file" was null or undefined when calling createTranscription().'
            );
        }

        if (requestParameters['model'] == null) {
            throw new runtime.RequiredError(
                'model',
                'Required parameter "model" was null or undefined when calling createTranscription().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const consumes: runtime.Consume[] = [
            { contentType: 'multipart/form-data' },
        ];
        // @ts-ignore: canConsumeForm may be unused
        const canConsumeForm = runtime.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): any };
        let useForm = false;
        // use FormData to transmit files using content-type "multipart/form-data"
        useForm = canConsumeForm;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new URLSearchParams();
        }

        if (requestParameters['file'] != null) {
            formParams.append('file', requestParameters['file'] as any);
        }

        if (requestParameters['model'] != null) {
            formParams.append('model', new Blob([JSON.stringify(CreateTranscriptionRequestModelToJSON(requestParameters['model']))], { type: "application/json", }));
                    }

        if (requestParameters['language'] != null) {
            formParams.append('language', requestParameters['language'] as any);
        }

        if (requestParameters['prompt'] != null) {
            formParams.append('prompt', requestParameters['prompt'] as any);
        }

        if (requestParameters['responseFormat'] != null) {
            formParams.append('response_format', requestParameters['responseFormat'] as any);
        }

        if (requestParameters['temperature'] != null) {
            formParams.append('temperature', requestParameters['temperature'] as any);
        }

        if (requestParameters['timestampGranularities'] != null) {
            formParams.append('timestamp_granularities[]', requestParameters['timestampGranularities']!.join(runtime.COLLECTION_FORMATS["csv"]));
        }

        const response = await this.request({
            path: `/audio/transcriptions`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: formParams,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CreateTranscription200ResponseFromJSON(jsonValue));
    }

    /**
     * Transcribes audio into the input language.
     */
    async createTranscription(requestParameters: CreateTranscriptionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CreateTranscription200Response> {
        const response = await this.createTranscriptionRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Translates audio into English.
     */
    async createTranslationRaw(requestParameters: CreateTranslationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CreateTranslation200Response>> {
        if (requestParameters['file'] == null) {
            throw new runtime.RequiredError(
                'file',
                'Required parameter "file" was null or undefined when calling createTranslation().'
            );
        }

        if (requestParameters['model'] == null) {
            throw new runtime.RequiredError(
                'model',
                'Required parameter "model" was null or undefined when calling createTranslation().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("ApiKeyAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const consumes: runtime.Consume[] = [
            { contentType: 'multipart/form-data' },
        ];
        // @ts-ignore: canConsumeForm may be unused
        const canConsumeForm = runtime.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): any };
        let useForm = false;
        // use FormData to transmit files using content-type "multipart/form-data"
        useForm = canConsumeForm;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new URLSearchParams();
        }

        if (requestParameters['file'] != null) {
            formParams.append('file', requestParameters['file'] as any);
        }

        if (requestParameters['model'] != null) {
            formParams.append('model', new Blob([JSON.stringify(CreateTranscriptionRequestModelToJSON(requestParameters['model']))], { type: "application/json", }));
                    }

        if (requestParameters['prompt'] != null) {
            formParams.append('prompt', requestParameters['prompt'] as any);
        }

        if (requestParameters['responseFormat'] != null) {
            formParams.append('response_format', requestParameters['responseFormat'] as any);
        }

        if (requestParameters['temperature'] != null) {
            formParams.append('temperature', requestParameters['temperature'] as any);
        }

        const response = await this.request({
            path: `/audio/translations`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: formParams,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CreateTranslation200ResponseFromJSON(jsonValue));
    }

    /**
     * Translates audio into English.
     */
    async createTranslation(requestParameters: CreateTranslationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CreateTranslation200Response> {
        const response = await this.createTranslationRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const CreateTranscriptionResponseFormatEnum = {
    Json: 'json',
    Text: 'text',
    Srt: 'srt',
    VerboseJson: 'verbose_json',
    Vtt: 'vtt'
} as const;
export type CreateTranscriptionResponseFormatEnum = typeof CreateTranscriptionResponseFormatEnum[keyof typeof CreateTranscriptionResponseFormatEnum];
/**
 * @export
 */
export const CreateTranscriptionTimestampGranularitiesEnum = {
    Word: 'word',
    Segment: 'segment'
} as const;
export type CreateTranscriptionTimestampGranularitiesEnum = typeof CreateTranscriptionTimestampGranularitiesEnum[keyof typeof CreateTranscriptionTimestampGranularitiesEnum];