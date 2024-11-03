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

import { CreateSpeechRequest } from '../model/createSpeechRequest';
import { CreateTranscription200Response } from '../model/createTranscription200Response';
import { CreateTranscriptionRequestModel } from '../model/createTranscriptionRequestModel';
import { CreateTranslation200Response } from '../model/createTranslation200Response';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class AudioService {
    private basePath: string = 'https://api.openai.com/v1';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Generates audio from the input text.
     * 
     * @param createSpeechRequest 
     
     */
    public createSpeech(createSpeechRequest: CreateSpeechRequest, observe?: 'body', headers?: Headers): Observable<Blob>;
    public createSpeech(createSpeechRequest: CreateSpeechRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<Blob>>;
    public createSpeech(createSpeechRequest: CreateSpeechRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (createSpeechRequest === null || createSpeechRequest === undefined){
            throw new Error('Required parameter createSpeechRequest was null or undefined when calling createSpeech.');
        }

        // authentication (ApiKeyAuth) required
        headers['Accept'] = 'application/octet-stream';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Blob>> = this.httpClient.post(`${this.basePath}/audio/speech`, createSpeechRequest , headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <Blob>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Transcribes audio into the input language.
     * 
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * @param prompt An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
     * @param responseFormat The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @param timestampGranularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
     
     */
    public createTranscription(file: Blob, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: string, temperature?: number, timestampGranularities?: Array<string>, observe?: 'body', headers?: Headers): Observable<CreateTranscription200Response>;
    public createTranscription(file: Blob, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: string, temperature?: number, timestampGranularities?: Array<string>, observe?: 'response', headers?: Headers): Observable<HttpResponse<CreateTranscription200Response>>;
    public createTranscription(file: Blob, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: string, temperature?: number, timestampGranularities?: Array<string>, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (file === null || file === undefined){
            throw new Error('Required parameter file was null or undefined when calling createTranscription.');
        }

        if (model === null || model === undefined){
            throw new Error('Required parameter model was null or undefined when calling createTranscription.');
        }

        // authentication (ApiKeyAuth) required
        headers['Accept'] = 'application/json';

        let formData: FormData = new FormData();
        headers['Content-Type'] = 'multipart/form-data';
        if (file !== undefined) {
            formData.append('file', <any>file);
        }
        if (model !== undefined) {
            formData.append('model', <any>model);
        }
        if (language !== undefined) {
            formData.append('language', <any>language);
        }
        if (prompt !== undefined) {
            formData.append('prompt', <any>prompt);
        }
        if (responseFormat !== undefined) {
            formData.append('response_format', <any>responseFormat);
        }
        if (temperature !== undefined) {
            formData.append('temperature', <any>temperature);
        }
        if (timestampGranularities) {
            formData.append('timestamp_granularities[]', timestampGranularities.join(COLLECTION_FORMATS['csv']));
        }

        const response: Observable<HttpResponse<CreateTranscription200Response>> = this.httpClient.post(`${this.basePath}/audio/transcriptions`, formData, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <CreateTranscription200Response>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Translates audio into English.
     * 
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @param responseFormat The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     
     */
    public createTranslation(file: Blob, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, observe?: 'body', headers?: Headers): Observable<CreateTranslation200Response>;
    public createTranslation(file: Blob, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, observe?: 'response', headers?: Headers): Observable<HttpResponse<CreateTranslation200Response>>;
    public createTranslation(file: Blob, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (file === null || file === undefined){
            throw new Error('Required parameter file was null or undefined when calling createTranslation.');
        }

        if (model === null || model === undefined){
            throw new Error('Required parameter model was null or undefined when calling createTranslation.');
        }

        // authentication (ApiKeyAuth) required
        headers['Accept'] = 'application/json';

        let formData: FormData = new FormData();
        headers['Content-Type'] = 'multipart/form-data';
        if (file !== undefined) {
            formData.append('file', <any>file);
        }
        if (model !== undefined) {
            formData.append('model', <any>model);
        }
        if (prompt !== undefined) {
            formData.append('prompt', <any>prompt);
        }
        if (responseFormat !== undefined) {
            formData.append('response_format', <any>responseFormat);
        }
        if (temperature !== undefined) {
            formData.append('temperature', <any>temperature);
        }

        const response: Observable<HttpResponse<CreateTranslation200Response>> = this.httpClient.post(`${this.basePath}/audio/translations`, formData, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <CreateTranslation200Response>(httpResponse.response))
               );
        }
        return response;
    }

}
