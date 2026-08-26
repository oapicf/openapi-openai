import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { VectorStoresApi } from '../api';
import { CreateVectorStoreFileBatchRequest, CreateVectorStoreFileRequest, CreateVectorStoreRequest, DeleteVectorStoreFileResponse, DeleteVectorStoreResponse, ListVectorStoreFilesResponse, ListVectorStoresResponse, UpdateVectorStoreRequest, VectorStoreFileBatchObject, VectorStoreFileObject, VectorStoreObject,  } from '../models';

@Controller()
export class VectorStoresApiController {
  constructor(private readonly vectorStoresApi: VectorStoresApi) {}

  @Post('/vector_stores/:vector_store_id/file_batches/:batch_id/cancel')
  cancelVectorStoreFileBatch(@Param('vector_store_id') vectorStoreId: string, @Param('batch_id') batchId: string, @Req() request: Request): VectorStoreFileBatchObject | Promise<VectorStoreFileBatchObject> | Observable<VectorStoreFileBatchObject> {
    return this.vectorStoresApi.cancelVectorStoreFileBatch(vectorStoreId, batchId, request);
  }

  @Post('/vector_stores')
  createVectorStore(@Body() createVectorStoreRequest: CreateVectorStoreRequest, @Req() request: Request): VectorStoreObject | Promise<VectorStoreObject> | Observable<VectorStoreObject> {
    return this.vectorStoresApi.createVectorStore(createVectorStoreRequest, request);
  }

  @Post('/vector_stores/:vector_store_id/files')
  createVectorStoreFile(@Param('vector_store_id') vectorStoreId: string, @Body() createVectorStoreFileRequest: CreateVectorStoreFileRequest, @Req() request: Request): VectorStoreFileObject | Promise<VectorStoreFileObject> | Observable<VectorStoreFileObject> {
    return this.vectorStoresApi.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest, request);
  }

  @Post('/vector_stores/:vector_store_id/file_batches')
  createVectorStoreFileBatch(@Param('vector_store_id') vectorStoreId: string, @Body() createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest, @Req() request: Request): VectorStoreFileBatchObject | Promise<VectorStoreFileBatchObject> | Observable<VectorStoreFileBatchObject> {
    return this.vectorStoresApi.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest, request);
  }

  @Delete('/vector_stores/:vector_store_id')
  deleteVectorStore(@Param('vector_store_id') vectorStoreId: string, @Req() request: Request): DeleteVectorStoreResponse | Promise<DeleteVectorStoreResponse> | Observable<DeleteVectorStoreResponse> {
    return this.vectorStoresApi.deleteVectorStore(vectorStoreId, request);
  }

  @Delete('/vector_stores/:vector_store_id/files/:file_id')
  deleteVectorStoreFile(@Param('vector_store_id') vectorStoreId: string, @Param('file_id') fileId: string, @Req() request: Request): DeleteVectorStoreFileResponse | Promise<DeleteVectorStoreFileResponse> | Observable<DeleteVectorStoreFileResponse> {
    return this.vectorStoresApi.deleteVectorStoreFile(vectorStoreId, fileId, request);
  }

  @Get('/vector_stores/:vector_store_id')
  getVectorStore(@Param('vector_store_id') vectorStoreId: string, @Req() request: Request): VectorStoreObject | Promise<VectorStoreObject> | Observable<VectorStoreObject> {
    return this.vectorStoresApi.getVectorStore(vectorStoreId, request);
  }

  @Get('/vector_stores/:vector_store_id/files/:file_id')
  getVectorStoreFile(@Param('vector_store_id') vectorStoreId: string, @Param('file_id') fileId: string, @Req() request: Request): VectorStoreFileObject | Promise<VectorStoreFileObject> | Observable<VectorStoreFileObject> {
    return this.vectorStoresApi.getVectorStoreFile(vectorStoreId, fileId, request);
  }

  @Get('/vector_stores/:vector_store_id/file_batches/:batch_id')
  getVectorStoreFileBatch(@Param('vector_store_id') vectorStoreId: string, @Param('batch_id') batchId: string, @Req() request: Request): VectorStoreFileBatchObject | Promise<VectorStoreFileBatchObject> | Observable<VectorStoreFileBatchObject> {
    return this.vectorStoresApi.getVectorStoreFileBatch(vectorStoreId, batchId, request);
  }

  @Get('/vector_stores/:vector_store_id/file_batches/:batch_id/files')
  listFilesInVectorStoreBatch(@Param('vector_store_id') vectorStoreId: string, @Param('batch_id') batchId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Query('filter') filter: 'in_progress' | 'completed' | 'failed' | 'cancelled' | undefined, @Req() request: Request): ListVectorStoreFilesResponse | Promise<ListVectorStoreFilesResponse> | Observable<ListVectorStoreFilesResponse> {
    return this.vectorStoresApi.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter, request);
  }

  @Get('/vector_stores/:vector_store_id/files')
  listVectorStoreFiles(@Param('vector_store_id') vectorStoreId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Query('filter') filter: 'in_progress' | 'completed' | 'failed' | 'cancelled' | undefined, @Req() request: Request): ListVectorStoreFilesResponse | Promise<ListVectorStoreFilesResponse> | Observable<ListVectorStoreFilesResponse> {
    return this.vectorStoresApi.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter, request);
  }

  @Get('/vector_stores')
  listVectorStores(@Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Req() request: Request): ListVectorStoresResponse | Promise<ListVectorStoresResponse> | Observable<ListVectorStoresResponse> {
    return this.vectorStoresApi.listVectorStores(limit, order, after, before, request);
  }

  @Post('/vector_stores/:vector_store_id')
  modifyVectorStore(@Param('vector_store_id') vectorStoreId: string, @Body() updateVectorStoreRequest: UpdateVectorStoreRequest, @Req() request: Request): VectorStoreObject | Promise<VectorStoreObject> | Observable<VectorStoreObject> {
    return this.vectorStoresApi.modifyVectorStore(vectorStoreId, updateVectorStoreRequest, request);
  }

} 