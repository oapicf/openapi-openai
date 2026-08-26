import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreateImageEditRequestModel, CreateImageRequest, ImagesResponse,  } from '../models';


@Injectable()
export abstract class ImagesApi {

  abstract createImage(createImageRequest: CreateImageRequest,  request: Request): ImagesResponse | Promise<ImagesResponse> | Observable<ImagesResponse>;


  abstract createImageEdit(image: Blob, prompt: string, mask: Blob | undefined, model: CreateImageEditRequestModel | null | undefined, n: number | null | undefined, size: string | null | undefined, responseFormat: string | null | undefined, user: string | undefined,  request: Request): ImagesResponse | Promise<ImagesResponse> | Observable<ImagesResponse>;


  abstract createImageVariation(image: Blob, model: CreateImageEditRequestModel | null | undefined, n: number | null | undefined, responseFormat: string | null | undefined, size: string | null | undefined, user: string | undefined,  request: Request): ImagesResponse | Promise<ImagesResponse> | Observable<ImagesResponse>;

} 