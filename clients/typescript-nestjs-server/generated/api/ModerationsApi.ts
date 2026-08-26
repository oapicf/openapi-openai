import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreateModerationRequest, CreateModerationResponse,  } from '../models';


@Injectable()
export abstract class ModerationsApi {

  abstract createModeration(createModerationRequest: CreateModerationRequest,  request: Request): CreateModerationResponse | Promise<CreateModerationResponse> | Observable<CreateModerationResponse>;

} 