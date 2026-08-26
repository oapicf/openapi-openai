import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage } from './run-step-delta-step-details-tool-calls-code-output-image-object-image';


export interface RunStepDeltaStepDetailsToolCallsCodeOutputImageObject { 
  /**
   * The index of the output in the outputs array.
   */
  index: number;
  /**
   * Always `image`.
   */
  type: RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.TypeEnum;
  image?: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
}
export namespace RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
  export const TypeEnum = {
    Image: 'image'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


