import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Batch, CreateBatchRequest, ListBatchesResponse,  } from '../models';


@Injectable()
export abstract class BatchApi {

  abstract cancelBatch(batchId: string,  request: Request): Batch | Promise<Batch> | Observable<Batch>;


  abstract createBatch(createBatchRequest: CreateBatchRequest,  request: Request): Batch | Promise<Batch> | Observable<Batch>;


  abstract listBatches(after: string | undefined, limit: number | undefined,  request: Request): ListBatchesResponse | Promise<ListBatchesResponse> | Observable<ListBatchesResponse>;


  abstract retrieveBatch(batchId: string,  request: Request): Batch | Promise<Batch> | Observable<Batch>;

} 