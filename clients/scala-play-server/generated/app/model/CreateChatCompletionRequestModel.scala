package model

import play.api.libs.json._

/**
  * ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionRequestModel(
)

object CreateChatCompletionRequestModel {
  implicit lazy val createChatCompletionRequestModelJsonFormat: Format[CreateChatCompletionRequestModel] = Json.format[CreateChatCompletionRequestModel]
}

