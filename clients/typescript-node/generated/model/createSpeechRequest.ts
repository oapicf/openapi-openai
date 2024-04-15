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

import { RequestFile } from './models';
import { CreateSpeechRequestModel } from './createSpeechRequestModel';

export class CreateSpeechRequest {
    'model': CreateSpeechRequestModel;
    /**
    * The text to generate audio for. The maximum length is 4096 characters.
    */
    'input': string;
    /**
    * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
    */
    'voice': CreateSpeechRequest.VoiceEnum;
    /**
    * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
    */
    'responseFormat'?: CreateSpeechRequest.ResponseFormatEnum = CreateSpeechRequest.ResponseFormatEnum.Mp3;
    /**
    * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
    */
    'speed'?: number = 1.0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "model",
            "baseName": "model",
            "type": "CreateSpeechRequestModel"
        },
        {
            "name": "input",
            "baseName": "input",
            "type": "string"
        },
        {
            "name": "voice",
            "baseName": "voice",
            "type": "CreateSpeechRequest.VoiceEnum"
        },
        {
            "name": "responseFormat",
            "baseName": "response_format",
            "type": "CreateSpeechRequest.ResponseFormatEnum"
        },
        {
            "name": "speed",
            "baseName": "speed",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CreateSpeechRequest.attributeTypeMap;
    }
}

export namespace CreateSpeechRequest {
    export enum VoiceEnum {
        Alloy = <any> 'alloy',
        Echo = <any> 'echo',
        Fable = <any> 'fable',
        Onyx = <any> 'onyx',
        Nova = <any> 'nova',
        Shimmer = <any> 'shimmer'
    }
    export enum ResponseFormatEnum {
        Mp3 = <any> 'mp3',
        Opus = <any> 'opus',
        Aac = <any> 'aac',
        Flac = <any> 'flac',
        Wav = <any> 'wav',
        Pcm = <any> 'pcm'
    }
}