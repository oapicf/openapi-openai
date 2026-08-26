import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreateEmbeddingRequest, CreateEmbeddingResponse,  } from '../models';


@Injectable()
export abstract class EmbeddingsApi {

  abstract createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest,  request: Request): CreateEmbeddingResponse | Promise<CreateEmbeddingResponse> | Observable<CreateEmbeddingResponse>;

} 