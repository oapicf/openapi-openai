package model

import play.api.libs.json._

/**
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateAssistantRequestModel(
)

object CreateAssistantRequestModel {
  implicit lazy val createAssistantRequestModelJsonFormat: Format[CreateAssistantRequestModel] = Json.format[CreateAssistantRequestModel]
}

