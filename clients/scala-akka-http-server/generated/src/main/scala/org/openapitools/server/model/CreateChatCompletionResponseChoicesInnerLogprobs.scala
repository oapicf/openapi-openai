package org.openapitools.server.model


/**
 * Log probability information for the choice.
 *
 * @param content A list of message content tokens with log probability information. for example: ''null''
 * @param refusal A list of message refusal tokens with log probability information. for example: ''null''
*/
final case class CreateChatCompletionResponseChoicesInnerLogprobs (
  content: Seq[ChatCompletionTokenLogprob],
  refusal: Seq[ChatCompletionTokenLogprob]
)

