package model

import play.api.libs.json._

/**
  * Log probability information for the choice.
  * @param content A list of message content tokens with log probability information.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateChatCompletionResponseChoicesInnerLogprobs(
  content: List[ChatCompletionTokenLogprob]
)

object CreateChatCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createChatCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateChatCompletionResponseChoicesInnerLogprobs] = Json.format[CreateChatCompletionResponseChoicesInnerLogprobs]
}

