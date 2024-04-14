package model

import play.api.libs.json._

/**
  * ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionRequestModel(
)

object CreateChatCompletionRequestModel {
  implicit lazy val createChatCompletionRequestModelJsonFormat: Format[CreateChatCompletionRequestModel] = Json.format[CreateChatCompletionRequestModel]
}

