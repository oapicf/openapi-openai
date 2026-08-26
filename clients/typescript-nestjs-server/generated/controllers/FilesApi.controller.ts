import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { FilesApi } from '../api';
import { DeleteFileResponse, ListFilesResponse, OpenAIFile,  } from '../models';

@Controller()
export class FilesApiController {
  constructor(private readonly filesApi: FilesApi) {}

  @Post('/files')
  createFile(file: Blob, purpose: string, @Req() request: Request): OpenAIFile | Promise<OpenAIFile> | Observable<OpenAIFile> {
    return this.filesApi.createFile(file, purpose, request);
  }

  @Delete('/files/:file_id')
  deleteFile(@Param('file_id') fileId: string, @Req() request: Request): DeleteFileResponse | Promise<DeleteFileResponse> | Observable<DeleteFileResponse> {
    return this.filesApi.deleteFile(fileId, request);
  }

  @Get('/files/:file_id/content')
  downloadFile(@Param('file_id') fileId: string, @Req() request: Request): string | Promise<string> | Observable<string> {
    return this.filesApi.downloadFile(fileId, request);
  }

  @Get('/files')
  listFiles(@Query('purpose') purpose: string | undefined, @Query('limit', new DefaultValuePipe(10000)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Req() request: Request): ListFilesResponse | Promise<ListFilesResponse> | Observable<ListFilesResponse> {
    return this.filesApi.listFiles(purpose, limit, order, after, request);
  }

  @Get('/files/:file_id')
  retrieveFile(@Param('file_id') fileId: string, @Req() request: Request): OpenAIFile | Promise<OpenAIFile> | Observable<OpenAIFile> {
    return this.filesApi.retrieveFile(fileId, request);
  }

} 