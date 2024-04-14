package model

import play.api.libs.json._

/**
  * Log probability information for the choice.
  * @param content A list of message content tokens with log probability information.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionResponseChoicesInnerLogprobs(
  content: List[ChatCompletionTokenLogprob]
)

object CreateChatCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createChatCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateChatCompletionResponseChoicesInnerLogprobs] = Json.format[CreateChatCompletionResponseChoicesInnerLogprobs]
}

