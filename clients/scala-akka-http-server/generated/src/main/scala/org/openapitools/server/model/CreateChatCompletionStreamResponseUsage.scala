package org.openapitools.server.model


/**
 * An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 *
 * @param completionTokens Number of tokens in the generated completion. for example: ''null''
 * @param promptTokens Number of tokens in the prompt. for example: ''null''
 * @param totalTokens Total number of tokens used in the request (prompt + completion). for example: ''null''
*/
final case class CreateChatCompletionStreamResponseUsage (
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int
)

