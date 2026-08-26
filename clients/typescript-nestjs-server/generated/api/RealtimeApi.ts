import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { RealtimeSessionCreateRequest, RealtimeSessionCreateResponse,  } from '../models';


@Injectable()
export abstract class RealtimeApi {

  abstract createRealtimeSession(realtimeSessionCreateRequest: RealtimeSessionCreateRequest,  request: Request): RealtimeSessionCreateResponse | Promise<RealtimeSessionCreateResponse> | Observable<RealtimeSessionCreateResponse>;

} 