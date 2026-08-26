import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdminApiKey, AdminApiKeysCreateRequest, AdminApiKeysDelete200Response, ApiKeyList,  } from '../models';


@Injectable()
export abstract class DefaultApi {

  abstract adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest,  request: Request): AdminApiKey | Promise<AdminApiKey> | Observable<AdminApiKey>;


  abstract adminApiKeysDelete(keyId: string,  request: Request): AdminApiKeysDelete200Response | Promise<AdminApiKeysDelete200Response> | Observable<AdminApiKeysDelete200Response>;


  abstract adminApiKeysGet(keyId: string,  request: Request): AdminApiKey | Promise<AdminApiKey> | Observable<AdminApiKey>;


  abstract adminApiKeysList(after: string | null | undefined, order: 'asc' | 'desc' | undefined, limit: number | undefined,  request: Request): ApiKeyList | Promise<ApiKeyList> | Observable<ApiKeyList>;

} 