import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { UsageApi } from '../api';
import { UsageResponse,  } from '../models';

@Controller()
export class UsageApiController {
  constructor(private readonly usageApi: UsageApi) {}

  @Get('/organization/usage/audio_speeches')
  usageAudioSpeeches(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('user_ids') userIds: Array<string> | undefined, @Query('api_key_ids') apiKeyIds: Array<string> | undefined, @Query('models') models: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, request);
  }

  @Get('/organization/usage/audio_transcriptions')
  usageAudioTranscriptions(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('user_ids') userIds: Array<string> | undefined, @Query('api_key_ids') apiKeyIds: Array<string> | undefined, @Query('models') models: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, request);
  }

  @Get('/organization/usage/code_interpreter_sessions')
  usageCodeInterpreterSessions(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, request);
  }

  @Get('/organization/usage/completions')
  usageCompletions(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('user_ids') userIds: Array<string> | undefined, @Query('api_key_ids') apiKeyIds: Array<string> | undefined, @Query('models') models: Array<string> | undefined, @Query('batch') batch: boolean | undefined, @Query('group_by') groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page, request);
  }

  @Get('/organization/costs')
  usageCosts(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id' | 'line_item'> | undefined, @Query('limit', new DefaultValuePipe(7)) limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, request);
  }

  @Get('/organization/usage/embeddings')
  usageEmbeddings(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('user_ids') userIds: Array<string> | undefined, @Query('api_key_ids') apiKeyIds: Array<string> | undefined, @Query('models') models: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, request);
  }

  @Get('/organization/usage/images')
  usageImages(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('sources') sources: Array<'image.generation' | 'image.edit' | 'image.variation'> | undefined, @Query('sizes') sizes: Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'> | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('user_ids') userIds: Array<string> | undefined, @Query('api_key_ids') apiKeyIds: Array<string> | undefined, @Query('models') models: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, request);
  }

  @Get('/organization/usage/moderations')
  usageModerations(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('user_ids') userIds: Array<string> | undefined, @Query('api_key_ids') apiKeyIds: Array<string> | undefined, @Query('models') models: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, request);
  }

  @Get('/organization/usage/vector_stores')
  usageVectorStores(@Query('start_time') startTime: number, @Query('end_time') endTime: number | undefined, @Query('bucket_width', new DefaultValuePipe('1d')) bucketWidth: '1m' | '1h' | '1d' | undefined, @Query('project_ids') projectIds: Array<string> | undefined, @Query('group_by') groupBy: Array<'project_id'> | undefined, @Query('limit') limit: number | undefined, @Query('page') page: string | undefined, @Req() request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse> {
    return this.usageApi.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, request);
  }

} 