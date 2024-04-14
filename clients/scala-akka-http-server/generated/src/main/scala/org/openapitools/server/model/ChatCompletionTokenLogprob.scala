package org.openapitools.server.model


/**
 * @param token The token. for example: ''null''
 * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. for example: ''null''
 * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. for example: ''null''
 * @param topLogprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned. for example: ''null''
*/
final case class ChatCompletionTokenLogprob (
  token: String,
  logprob: Double,
  bytes: Seq[Int],
  topLogprobs: Seq[ChatCompletionTokenLogprobTopLogprobsInner]
)

