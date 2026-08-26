import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CompletionsApi } from '../api';
import { CreateCompletionRequest, CreateCompletionResponse,  } from '../models';

@Controller()
export class CompletionsApiController {
  constructor(private readonly completionsApi: CompletionsApi) {}

  @Post('/completions')
  createCompletion(@Body() createCompletionRequest: CreateCompletionRequest, @Req() request: Request): CreateCompletionResponse | Promise<CreateCompletionResponse> | Observable<CreateCompletionResponse> {
    return this.completionsApi.createCompletion(createCompletionRequest, request);
  }

} 