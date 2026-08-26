import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { RealtimeApi } from '../api';
import { RealtimeSessionCreateRequest, RealtimeSessionCreateResponse,  } from '../models';

@Controller()
export class RealtimeApiController {
  constructor(private readonly realtimeApi: RealtimeApi) {}

  @Post('/realtime/sessions')
  createRealtimeSession(@Body() realtimeSessionCreateRequest: RealtimeSessionCreateRequest, @Req() request: Request): RealtimeSessionCreateResponse | Promise<RealtimeSessionCreateResponse> | Observable<RealtimeSessionCreateResponse> {
    return this.realtimeApi.createRealtimeSession(realtimeSessionCreateRequest, request);
  }

} 