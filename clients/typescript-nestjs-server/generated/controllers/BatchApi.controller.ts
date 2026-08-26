import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BatchApi } from '../api';
import { Batch, CreateBatchRequest, ListBatchesResponse,  } from '../models';

@Controller()
export class BatchApiController {
  constructor(private readonly batchApi: BatchApi) {}

  @Post('/batches/:batch_id/cancel')
  cancelBatch(@Param('batch_id') batchId: string, @Req() request: Request): Batch | Promise<Batch> | Observable<Batch> {
    return this.batchApi.cancelBatch(batchId, request);
  }

  @Post('/batches')
  createBatch(@Body() createBatchRequest: CreateBatchRequest, @Req() request: Request): Batch | Promise<Batch> | Observable<Batch> {
    return this.batchApi.createBatch(createBatchRequest, request);
  }

  @Get('/batches')
  listBatches(@Query('after') after: string | undefined, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Req() request: Request): ListBatchesResponse | Promise<ListBatchesResponse> | Observable<ListBatchesResponse> {
    return this.batchApi.listBatches(after, limit, request);
  }

  @Get('/batches/:batch_id')
  retrieveBatch(@Param('batch_id') batchId: string, @Req() request: Request): Batch | Promise<Batch> | Observable<Batch> {
    return this.batchApi.retrieveBatch(batchId, request);
  }

} 