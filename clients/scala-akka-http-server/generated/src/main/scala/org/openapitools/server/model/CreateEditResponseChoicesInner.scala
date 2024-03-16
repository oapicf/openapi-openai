package org.openapitools.server.model


/**
 * @param text  for example: ''null''
 * @param index  for example: ''null''
 * @param logprobs  for example: ''null''
 * @param finishReason  for example: ''null''
*/
final case class CreateEditResponseChoicesInner (
  text: Option[String] = None,
  index: Option[Int] = None,
  logprobs: Option[CreateCompletionResponseChoicesInnerLogprobs] = None,
  finishReason: Option[String] = None
)

