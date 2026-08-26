import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreateVectorStoreFileBatchRequest, CreateVectorStoreFileRequest, CreateVectorStoreRequest, DeleteVectorStoreFileResponse, DeleteVectorStoreResponse, ListVectorStoreFilesResponse, ListVectorStoresResponse, UpdateVectorStoreRequest, VectorStoreFileBatchObject, VectorStoreFileObject, VectorStoreObject,  } from '../models';


@Injectable()
export abstract class VectorStoresApi {

  abstract cancelVectorStoreFileBatch(vectorStoreId: string, batchId: string,  request: Request): VectorStoreFileBatchObject | Promise<VectorStoreFileBatchObject> | Observable<VectorStoreFileBatchObject>;


  abstract createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest,  request: Request): VectorStoreObject | Promise<VectorStoreObject> | Observable<VectorStoreObject>;


  abstract createVectorStoreFile(vectorStoreId: string, createVectorStoreFileRequest: CreateVectorStoreFileRequest,  request: Request): VectorStoreFileObject | Promise<VectorStoreFileObject> | Observable<VectorStoreFileObject>;


  abstract createVectorStoreFileBatch(vectorStoreId: string, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest,  request: Request): VectorStoreFileBatchObject | Promise<VectorStoreFileBatchObject> | Observable<VectorStoreFileBatchObject>;


  abstract deleteVectorStore(vectorStoreId: string,  request: Request): DeleteVectorStoreResponse | Promise<DeleteVectorStoreResponse> | Observable<DeleteVectorStoreResponse>;


  abstract deleteVectorStoreFile(vectorStoreId: string, fileId: string,  request: Request): DeleteVectorStoreFileResponse | Promise<DeleteVectorStoreFileResponse> | Observable<DeleteVectorStoreFileResponse>;


  abstract getVectorStore(vectorStoreId: string,  request: Request): VectorStoreObject | Promise<VectorStoreObject> | Observable<VectorStoreObject>;


  abstract getVectorStoreFile(vectorStoreId: string, fileId: string,  request: Request): VectorStoreFileObject | Promise<VectorStoreFileObject> | Observable<VectorStoreFileObject>;


  abstract getVectorStoreFileBatch(vectorStoreId: string, batchId: string,  request: Request): VectorStoreFileBatchObject | Promise<VectorStoreFileBatchObject> | Observable<VectorStoreFileBatchObject>;


  abstract listFilesInVectorStoreBatch(vectorStoreId: string, batchId: string, limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined, before: string | undefined, filter: 'in_progress' | 'completed' | 'failed' | 'cancelled' | undefined,  request: Request): ListVectorStoreFilesResponse | Promise<ListVectorStoreFilesResponse> | Observable<ListVectorStoreFilesResponse>;


  abstract listVectorStoreFiles(vectorStoreId: string, limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined, before: string | undefined, filter: 'in_progress' | 'completed' | 'failed' | 'cancelled' | undefined,  request: Request): ListVectorStoreFilesResponse | Promise<ListVectorStoreFilesResponse> | Observable<ListVectorStoreFilesResponse>;


  abstract listVectorStores(limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined, before: string | undefined,  request: Request): ListVectorStoresResponse | Promise<ListVectorStoresResponse> | Observable<ListVectorStoresResponse>;


  abstract modifyVectorStore(vectorStoreId: string, updateVectorStoreRequest: UpdateVectorStoreRequest,  request: Request): VectorStoreObject | Promise<VectorStoreObject> | Observable<VectorStoreObject>;

} 