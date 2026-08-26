import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CompleteUploadRequest, CreateUploadRequest, Upload, UploadPart,  } from '../models';


@Injectable()
export abstract class UploadsApi {

  abstract addUploadPart(uploadId: string, data: Blob,  request: Request): UploadPart | Promise<UploadPart> | Observable<UploadPart>;


  abstract cancelUpload(uploadId: string,  request: Request): Upload | Promise<Upload> | Observable<Upload>;


  abstract completeUpload(uploadId: string, completeUploadRequest: CompleteUploadRequest,  request: Request): Upload | Promise<Upload> | Observable<Upload>;


  abstract createUpload(createUploadRequest: CreateUploadRequest,  request: Request): Upload | Promise<Upload> | Observable<Upload>;

} 