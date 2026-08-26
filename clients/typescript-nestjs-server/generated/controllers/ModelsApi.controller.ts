import { Body, Controller, DefaultValuePipe, Delete, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ModelsApi } from '../api';
import { DeleteModelResponse, ListModelsResponse, Model,  } from '../models';

@Controller()
export class ModelsApiController {
  constructor(private readonly modelsApi: ModelsApi) {}

  @Delete('/models/:model')
  deleteModel(@Param('model') model: string, @Req() request: Request): DeleteModelResponse | Promise<DeleteModelResponse> | Observable<DeleteModelResponse> {
    return this.modelsApi.deleteModel(model, request);
  }

  @Get('/models')
  listModels(@Req() request: Request): ListModelsResponse | Promise<ListModelsResponse> | Observable<ListModelsResponse> {
    return this.modelsApi.listModels(request);
  }

  @Get('/models/:model')
  retrieveModel(@Param('model') model: string, @Req() request: Request): Model | Promise<Model> | Observable<Model> {
    return this.modelsApi.retrieveModel(model, request);
  }

} 