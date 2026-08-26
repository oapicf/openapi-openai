import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { UploadsApi } from '../api';
import { CompleteUploadRequest, CreateUploadRequest, Upload, UploadPart,  } from '../models';

@Controller()
export class UploadsApiController {
  constructor(private readonly uploadsApi: UploadsApi) {}

  @Post('/uploads/:upload_id/parts')
  addUploadPart(@Param('upload_id') uploadId: string, data: Blob, @Req() request: Request): UploadPart | Promise<UploadPart> | Observable<UploadPart> {
    return this.uploadsApi.addUploadPart(uploadId, data, request);
  }

  @Post('/uploads/:upload_id/cancel')
  cancelUpload(@Param('upload_id') uploadId: string, @Req() request: Request): Upload | Promise<Upload> | Observable<Upload> {
    return this.uploadsApi.cancelUpload(uploadId, request);
  }

  @Post('/uploads/:upload_id/complete')
  completeUpload(@Param('upload_id') uploadId: string, @Body() completeUploadRequest: CompleteUploadRequest, @Req() request: Request): Upload | Promise<Upload> | Observable<Upload> {
    return this.uploadsApi.completeUpload(uploadId, completeUploadRequest, request);
  }

  @Post('/uploads')
  createUpload(@Body() createUploadRequest: CreateUploadRequest, @Req() request: Request): Upload | Promise<Upload> | Observable<Upload> {
    return this.uploadsApi.createUpload(createUploadRequest, request);
  }

} 