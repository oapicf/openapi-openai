import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { UsageResponse,  } from '../models';


@Injectable()
export abstract class UsageApi {

  abstract usageAudioSpeeches(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, projectIds: Array<string> | undefined, userIds: Array<string> | undefined, apiKeyIds: Array<string> | undefined, models: Array<string> | undefined, groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageAudioTranscriptions(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, projectIds: Array<string> | undefined, userIds: Array<string> | undefined, apiKeyIds: Array<string> | undefined, models: Array<string> | undefined, groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageCodeInterpreterSessions(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, projectIds: Array<string> | undefined, groupBy: Array<'project_id'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageCompletions(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, projectIds: Array<string> | undefined, userIds: Array<string> | undefined, apiKeyIds: Array<string> | undefined, models: Array<string> | undefined, batch: boolean | undefined, groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageCosts(startTime: number, endTime: number | undefined, bucketWidth: '1d' | undefined, projectIds: Array<string> | undefined, groupBy: Array<'project_id' | 'line_item'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageEmbeddings(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, projectIds: Array<string> | undefined, userIds: Array<string> | undefined, apiKeyIds: Array<string> | undefined, models: Array<string> | undefined, groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageImages(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, sources: Array<'image.generation' | 'image.edit' | 'image.variation'> | undefined, sizes: Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'> | undefined, projectIds: Array<string> | undefined, userIds: Array<string> | undefined, apiKeyIds: Array<string> | undefined, models: Array<string> | undefined, groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageModerations(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, projectIds: Array<string> | undefined, userIds: Array<string> | undefined, apiKeyIds: Array<string> | undefined, models: Array<string> | undefined, groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;


  abstract usageVectorStores(startTime: number, endTime: number | undefined, bucketWidth: '1m' | '1h' | '1d' | undefined, projectIds: Array<string> | undefined, groupBy: Array<'project_id'> | undefined, limit: number | undefined, page: string | undefined,  request: Request): UsageResponse | Promise<UsageResponse> | Observable<UsageResponse>;

} 