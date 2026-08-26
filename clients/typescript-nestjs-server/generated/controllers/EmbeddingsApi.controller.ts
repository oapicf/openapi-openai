import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { EmbeddingsApi } from '../api';
import { CreateEmbeddingRequest, CreateEmbeddingResponse,  } from '../models';

@Controller()
export class EmbeddingsApiController {
  constructor(private readonly embeddingsApi: EmbeddingsApi) {}

  @Post('/embeddings')
  createEmbedding(@Body() createEmbeddingRequest: CreateEmbeddingRequest, @Req() request: Request): CreateEmbeddingResponse | Promise<CreateEmbeddingResponse> | Observable<CreateEmbeddingResponse> {
    return this.embeddingsApi.createEmbedding(createEmbeddingRequest, request);
  }

} 