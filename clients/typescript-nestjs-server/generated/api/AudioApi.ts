import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AudioResponseFormat, CreateSpeechRequest, CreateTranscription200Response, CreateTranscriptionRequestModel, CreateTranslation200Response,  } from '../models';


@Injectable()
export abstract class AudioApi {

  abstract createSpeech(createSpeechRequest: CreateSpeechRequest,  request: Request): Blob | Promise<Blob> | Observable<Blob>;


  abstract createTranscription(file: Blob, model: CreateTranscriptionRequestModel, language: string | undefined, prompt: string | undefined, responseFormat: AudioResponseFormat | undefined, temperature: number | undefined, timestampGranularities: Array<string> | undefined,  request: Request): CreateTranscription200Response | Promise<CreateTranscription200Response> | Observable<CreateTranscription200Response>;


  abstract createTranslation(file: Blob, model: CreateTranscriptionRequestModel, prompt: string | undefined, responseFormat: AudioResponseFormat | undefined, temperature: number | undefined,  request: Request): CreateTranslation200Response | Promise<CreateTranslation200Response> | Observable<CreateTranslation200Response>;

} 