package org.openapitools.server.model


/**
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters.  for example: ''null''
 * @param index  for example: ''null''
 * @param logprobs  for example: ''null''
 * @param text  for example: ''null''
*/
final case class CreateCompletionResponseChoicesInner (
  finishReason: String,
  index: Int,
  logprobs: CreateCompletionResponseChoicesInnerLogprobs,
  text: String
)

