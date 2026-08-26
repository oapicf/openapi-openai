import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { DeleteModelResponse, ListModelsResponse, Model,  } from '../models';


@Injectable()
export abstract class ModelsApi {

  abstract deleteModel(model: string,  request: Request): DeleteModelResponse | Promise<DeleteModelResponse> | Observable<DeleteModelResponse>;


  abstract listModels( request: Request): ListModelsResponse | Promise<ListModelsResponse> | Observable<ListModelsResponse>;


  abstract retrieveModel(model: string,  request: Request): Model | Promise<Model> | Observable<Model>;

} 