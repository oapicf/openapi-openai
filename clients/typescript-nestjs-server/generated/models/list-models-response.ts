import { Model } from './model';


export interface ListModelsResponse { 
  object: ListModelsResponse.ObjectEnum;
  data: Array<Model>;
}
export namespace ListModelsResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


