import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ChatApi } from '../api';
import { CreateChatCompletionRequest, CreateChatCompletionResponse,  } from '../models';

@Controller()
export class ChatApiController {
  constructor(private readonly chatApi: ChatApi) {}

  @Post('/chat/completions')
  createChatCompletion(@Body() createChatCompletionRequest: CreateChatCompletionRequest, @Req() request: Request): CreateChatCompletionResponse | Promise<CreateChatCompletionResponse> | Observable<CreateChatCompletionResponse> {
    return this.chatApi.createChatCompletion(createChatCompletionRequest, request);
  }

} 