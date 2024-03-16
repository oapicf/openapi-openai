package org.openapitools.server.model


/**
 * @param tokens  for example: ''null''
 * @param tokenLogprobs  for example: ''null''
 * @param topLogprobs  for example: ''null''
 * @param textOffset  for example: ''null''
*/
final case class CreateCompletionResponseChoicesInnerLogprobs (
  tokens: Option[Seq[String]] = None,
  tokenLogprobs: Option[Seq[Double]] = None,
  topLogprobs: Option[Seq[Any]] = None,
  textOffset: Option[Seq[Int]] = None
)

