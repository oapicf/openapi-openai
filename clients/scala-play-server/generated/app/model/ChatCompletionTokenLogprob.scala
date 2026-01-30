package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionTokenLogprob.
  * @param token The token.
  * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  * @param topLogprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionTokenLogprob(
  token: String,
  logprob: BigDecimal,
  bytes: List[Int],
  topLogprobs: List[ChatCompletionTokenLogprobTopLogprobsInner]
)

object ChatCompletionTokenLogprob {
  implicit lazy val chatCompletionTokenLogprobJsonFormat: Format[ChatCompletionTokenLogprob] = Json.format[ChatCompletionTokenLogprob]
}

