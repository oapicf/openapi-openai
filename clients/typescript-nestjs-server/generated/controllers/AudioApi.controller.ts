import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AudioApi } from '../api';
import { AudioResponseFormat, CreateSpeechRequest, CreateTranscription200Response, CreateTranscriptionRequestModel, CreateTranslation200Response,  } from '../models';

@Controller()
export class AudioApiController {
  constructor(private readonly audioApi: AudioApi) {}

  @Post('/audio/speech')
  createSpeech(@Body() createSpeechRequest: CreateSpeechRequest, @Req() request: Request): Blob | Promise<Blob> | Observable<Blob> {
    return this.audioApi.createSpeech(createSpeechRequest, request);
  }

  @Post('/audio/transcriptions')
  createTranscription(file: Blob, model: CreateTranscriptionRequestModel, language: string | undefined, prompt: string | undefined, responseFormat: AudioResponseFormat | undefined, temperature: number | undefined, timestampGranularities: Array<string> | undefined, @Req() request: Request): CreateTranscription200Response | Promise<CreateTranscription200Response> | Observable<CreateTranscription200Response> {
    return this.audioApi.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities, request);
  }

  @Post('/audio/translations')
  createTranslation(file: Blob, model: CreateTranscriptionRequestModel, prompt: string | undefined, responseFormat: AudioResponseFormat | undefined, temperature: number | undefined, @Req() request: Request): CreateTranslation200Response | Promise<CreateTranslation200Response> | Observable<CreateTranslation200Response> {
    return this.audioApi.createTranslation(file, model, prompt, responseFormat, temperature, request);
  }

} 