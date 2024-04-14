goog.provide('API.Client.AssistantsApiResponseFormatOption');

/**
 * Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 * @record
 */
API.Client.AssistantsApiResponseFormatOption = function() {}

/**
 * Must be one of `text` or `json_object`.
 * @type {!string}
 * @export
 */
API.Client.AssistantsApiResponseFormatOption.prototype.type;

/** @enum {string} */
API.Client.AssistantsApiResponseFormatOption.TypeEnum = { 
  text: 'text',
  json_object: 'json_object',
}
