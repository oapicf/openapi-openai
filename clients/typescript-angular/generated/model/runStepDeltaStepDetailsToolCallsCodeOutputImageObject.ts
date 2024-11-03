/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage } from './runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';


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
    export type TypeEnum = 'image';
    export const TypeEnum = {
        Image: 'image' as TypeEnum
    };
}


