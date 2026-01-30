package model

import play.api.libs.json._

/**
  * Log probability information for the choice.
  * @param content A list of message content tokens with log probability information.
  * @param refusal A list of message refusal tokens with log probability information.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionResponseChoicesInnerLogprobs(
  content: List[ChatCompletionTokenLogprob],
  refusal: List[ChatCompletionTokenLogprob]
)

object CreateChatCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createChatCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateChatCompletionResponseChoicesInnerLogprobs] = Json.format[CreateChatCompletionResponseChoicesInnerLogprobs]
}

