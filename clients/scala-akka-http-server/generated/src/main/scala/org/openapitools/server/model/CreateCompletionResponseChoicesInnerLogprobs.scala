package org.openapitools.server.model


/**
 * @param textOffset  for example: ''null''
 * @param tokenLogprobs  for example: ''null''
 * @param tokens  for example: ''null''
 * @param topLogprobs  for example: ''null''
*/
final case class CreateCompletionResponseChoicesInnerLogprobs (
  textOffset: Option[Seq[Int]] = None,
  tokenLogprobs: Option[Seq[Double]] = None,
  tokens: Option[Seq[String]] = None,
  topLogprobs: Option[Seq[Map[String, Double]]] = None
)

