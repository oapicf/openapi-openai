package org.openapitools.server.model


/**
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.  for example: ''null''
 * @param index The index of the choice in the list of choices. for example: ''null''
 * @param message  for example: ''null''
*/
final case class CreateChatCompletionFunctionResponseChoicesInner (
  finishReason: String,
  index: Int,
  message: ChatCompletionResponseMessage
)

