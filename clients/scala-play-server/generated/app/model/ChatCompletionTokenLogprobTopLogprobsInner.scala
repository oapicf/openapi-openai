package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionTokenLogprob_top_logprobs_inner.
  * @param token The token.
  * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionTokenLogprobTopLogprobsInner(
  token: String,
  logprob: BigDecimal,
  bytes: List[Int]
)

object ChatCompletionTokenLogprobTopLogprobsInner {
  implicit lazy val chatCompletionTokenLogprobTopLogprobsInnerJsonFormat: Format[ChatCompletionTokenLogprobTopLogprobsInner] = Json.format[ChatCompletionTokenLogprobTopLogprobsInner]
}

