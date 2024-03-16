package org.openapitools.server.model


/**
 * @param text  for example: ''null''
 * @param index  for example: ''null''
 * @param logprobs  for example: ''null''
 * @param finishReason  for example: ''null''
*/
final case class CreateCompletionResponseChoicesInner (
  text: String,
  index: Int,
  logprobs: CreateCompletionResponseChoicesInnerLogprobs,
  finishReason: String
)

