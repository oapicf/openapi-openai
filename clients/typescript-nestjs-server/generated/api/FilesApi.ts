import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { DeleteFileResponse, ListFilesResponse, OpenAIFile,  } from '../models';


@Injectable()
export abstract class FilesApi {

  abstract createFile(file: Blob, purpose: string,  request: Request): OpenAIFile | Promise<OpenAIFile> | Observable<OpenAIFile>;


  abstract deleteFile(fileId: string,  request: Request): DeleteFileResponse | Promise<DeleteFileResponse> | Observable<DeleteFileResponse>;


  abstract downloadFile(fileId: string,  request: Request): string | Promise<string> | Observable<string>;


  abstract listFiles(purpose: string | undefined, limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined,  request: Request): ListFilesResponse | Promise<ListFilesResponse> | Observable<ListFilesResponse>;


  abstract retrieveFile(fileId: string,  request: Request): OpenAIFile | Promise<OpenAIFile> | Observable<OpenAIFile>;

} 