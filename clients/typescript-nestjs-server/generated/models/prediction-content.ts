import { PredictionContentContent } from './prediction-content-content';


/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */
export interface PredictionContent { 
  /**
   * The type of the predicted content you want to provide. This type is currently always `content`. 
   */
  type: PredictionContent.TypeEnum;
  content: PredictionContentContent;
}
export namespace PredictionContent {
  export const TypeEnum = {
    Content: 'content'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


