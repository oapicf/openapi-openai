/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { RunStepDetailsToolCallsCodeOutputImageObjectImage } from './runStepDetailsToolCallsCodeOutputImageObjectImage';


export interface RunStepDetailsToolCallsCodeOutputImageObject { 
    /**
     * Always `image`.
     */
    type: RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum;
    image: RunStepDetailsToolCallsCodeOutputImageObjectImage;
}
export namespace RunStepDetailsToolCallsCodeOutputImageObject {
    export type TypeEnum = 'image';
    export const TypeEnum = {
        Image: 'image' as TypeEnum
    };
}


