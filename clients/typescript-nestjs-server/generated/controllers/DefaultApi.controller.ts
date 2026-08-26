import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { DefaultApi } from '../api';
import { AdminApiKey, AdminApiKeysCreateRequest, AdminApiKeysDelete200Response, ApiKeyList,  } from '../models';

@Controller()
export class DefaultApiController {
  constructor(private readonly defaultApi: DefaultApi) {}

  @Post('/organization/admin_api_keys')
  adminApiKeysCreate(@Body() adminApiKeysCreateRequest: AdminApiKeysCreateRequest, @Req() request: Request): AdminApiKey | Promise<AdminApiKey> | Observable<AdminApiKey> {
    return this.defaultApi.adminApiKeysCreate(adminApiKeysCreateRequest, request);
  }

  @Delete('/organization/admin_api_keys/:key_id')
  adminApiKeysDelete(@Param('key_id') keyId: string, @Req() request: Request): AdminApiKeysDelete200Response | Promise<AdminApiKeysDelete200Response> | Observable<AdminApiKeysDelete200Response> {
    return this.defaultApi.adminApiKeysDelete(keyId, request);
  }

  @Get('/organization/admin_api_keys/:key_id')
  adminApiKeysGet(@Param('key_id') keyId: string, @Req() request: Request): AdminApiKey | Promise<AdminApiKey> | Observable<AdminApiKey> {
    return this.defaultApi.adminApiKeysGet(keyId, request);
  }

  @Get('/organization/admin_api_keys')
  adminApiKeysList(@Query('after') after: string | null | undefined, @Query('order', new DefaultValuePipe('asc')) order: 'asc' | 'desc' | undefined, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Req() request: Request): ApiKeyList | Promise<ApiKeyList> | Observable<ApiKeyList> {
    return this.defaultApi.adminApiKeysList(after, order, limit, request);
  }

} 