package model

import play.api.libs.json._

/**
  * ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateChatCompletionRequestModel(
)

object CreateChatCompletionRequestModel {
  implicit lazy val createChatCompletionRequestModelJsonFormat: Format[CreateChatCompletionRequestModel] = Json.format[CreateChatCompletionRequestModel]
}

