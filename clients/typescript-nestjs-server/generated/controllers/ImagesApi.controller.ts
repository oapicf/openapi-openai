import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ImagesApi } from '../api';
import { CreateImageEditRequestModel, CreateImageRequest, ImagesResponse,  } from '../models';

@Controller()
export class ImagesApiController {
  constructor(private readonly imagesApi: ImagesApi) {}

  @Post('/images/generations')
  createImage(@Body() createImageRequest: CreateImageRequest, @Req() request: Request): ImagesResponse | Promise<ImagesResponse> | Observable<ImagesResponse> {
    return this.imagesApi.createImage(createImageRequest, request);
  }

  @Post('/images/edits')
  createImageEdit(image: Blob, prompt: string, mask: Blob | undefined, model: CreateImageEditRequestModel | null | undefined, n: number | null | undefined, size: string | null | undefined, responseFormat: string | null | undefined, user: string | undefined, @Req() request: Request): ImagesResponse | Promise<ImagesResponse> | Observable<ImagesResponse> {
    return this.imagesApi.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user, request);
  }

  @Post('/images/variations')
  createImageVariation(image: Blob, model: CreateImageEditRequestModel | null | undefined, n: number | null | undefined, responseFormat: string | null | undefined, size: string | null | undefined, user: string | undefined, @Req() request: Request): ImagesResponse | Promise<ImagesResponse> | Observable<ImagesResponse> {
    return this.imagesApi.createImageVariation(image, model, n, responseFormat, size, user, request);
  }

} 