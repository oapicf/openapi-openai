import { CreateModerationRequestInputOneOfInner } from './create-moderation-request-input-one-of-inner';


/**
 * Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
 */
/**
 * @type CreateModerationRequestInput
 * Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
 * @export
 */
export type CreateModerationRequestInput = Array<CreateModerationRequestInputOneOfInner> | Array<string> | string;

