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
import type { CreateSpeechRequestModel } from './CreateSpeechRequestModel';
import {
    CreateSpeechRequestModelFromJSON,
    CreateSpeechRequestModelFromJSONTyped,
    CreateSpeechRequestModelToJSON,
    CreateSpeechRequestModelToJSONTyped,
} from './CreateSpeechRequestModel';

/**
 * 
 * @export
 * @interface CreateSpeechRequest
 */
export interface CreateSpeechRequest {
    /**
     * 
     * @type {CreateSpeechRequestModel}
     * @memberof CreateSpeechRequest
     */
    model: CreateSpeechRequestModel;
    /**
     * The text to generate audio for. The maximum length is 4096 characters.
     * @type {string}
     * @memberof CreateSpeechRequest
     */
    input: string;
    /**
     * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     * @type {string}
     * @memberof CreateSpeechRequest
     */
    voice: CreateSpeechRequestVoiceEnum;
    /**
     * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
     * @type {string}
     * @memberof CreateSpeechRequest
     */
    responseFormat?: CreateSpeechRequestResponseFormatEnum;
    /**
     * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
     * @type {number}
     * @memberof CreateSpeechRequest
     */
    speed?: number;
}


/**
 * @export
 */
export const CreateSpeechRequestVoiceEnum = {
    Alloy: 'alloy',
    Echo: 'echo',
    Fable: 'fable',
    Onyx: 'onyx',
    Nova: 'nova',
    Shimmer: 'shimmer'
} as const;
export type CreateSpeechRequestVoiceEnum = typeof CreateSpeechRequestVoiceEnum[keyof typeof CreateSpeechRequestVoiceEnum];

/**
 * @export
 */
export const CreateSpeechRequestResponseFormatEnum = {
    Mp3: 'mp3',
    Opus: 'opus',
    Aac: 'aac',
    Flac: 'flac',
    Wav: 'wav',
    Pcm: 'pcm'
} as const;
export type CreateSpeechRequestResponseFormatEnum = typeof CreateSpeechRequestResponseFormatEnum[keyof typeof CreateSpeechRequestResponseFormatEnum];


/**
 * Check if a given object implements the CreateSpeechRequest interface.
 */
export function instanceOfCreateSpeechRequest(value: object): value is CreateSpeechRequest {
    if (!('model' in value) || value['model'] === undefined) return false;
    if (!('input' in value) || value['input'] === undefined) return false;
    if (!('voice' in value) || value['voice'] === undefined) return false;
    return true;
}

export function CreateSpeechRequestFromJSON(json: any): CreateSpeechRequest {
    return CreateSpeechRequestFromJSONTyped(json, false);
}

export function CreateSpeechRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateSpeechRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'model': CreateSpeechRequestModelFromJSON(json['model']),
        'input': json['input'],
        'voice': json['voice'],
        'responseFormat': json['response_format'] == null ? undefined : json['response_format'],
        'speed': json['speed'] == null ? undefined : json['speed'],
    };
}

  export function CreateSpeechRequestToJSON(json: any): CreateSpeechRequest {
      return CreateSpeechRequestToJSONTyped(json, false);
  }

  export function CreateSpeechRequestToJSONTyped(value?: CreateSpeechRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'model': CreateSpeechRequestModelToJSON(value['model']),
        'input': value['input'],
        'voice': value['voice'],
        'response_format': value['responseFormat'],
        'speed': value['speed'],
    };
}

