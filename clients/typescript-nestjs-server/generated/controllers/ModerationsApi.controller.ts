import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ModerationsApi } from '../api';
import { CreateModerationRequest, CreateModerationResponse,  } from '../models';

@Controller()
export class ModerationsApiController {
  constructor(private readonly moderationsApi: ModerationsApi) {}

  @Post('/moderations')
  createModeration(@Body() createModerationRequest: CreateModerationRequest, @Req() request: Request): CreateModerationResponse | Promise<CreateModerationResponse> | Observable<CreateModerationResponse> {
    return this.moderationsApi.createModeration(createModerationRequest, request);
  }

} 