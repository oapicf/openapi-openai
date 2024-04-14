package org.openapitools.server.model


/**
 * @param delta  for example: ''null''
 * @param logprobs  for example: ''null''
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  for example: ''null''
 * @param index The index of the choice in the list of choices. for example: ''null''
*/
final case class CreateChatCompletionStreamResponseChoicesInner (
  delta: ChatCompletionStreamResponseDelta,
  logprobs: Option[CreateChatCompletionResponseChoicesInnerLogprobs] = None,
  finishReason: String,
  index: Int
)

