

/**
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 */
/**
 * @type CreateCompletionRequestStop
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 * @export
 */
export type CreateCompletionRequestStop = Array<string> | string;

