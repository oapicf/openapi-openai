import { RunStepDetailsToolCallsCodeOutputImageObjectImage } from './run-step-details-tool-calls-code-output-image-object-image';


export interface RunStepDetailsToolCallsCodeOutputImageObject { 
  /**
   * Always `image`.
   */
  type: RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum;
  image: RunStepDetailsToolCallsCodeOutputImageObjectImage;
}
export namespace RunStepDetailsToolCallsCodeOutputImageObject {
  export const TypeEnum = {
    Image: 'image'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


