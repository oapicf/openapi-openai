package model

import play.api.libs.json._

/**
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateAssistantRequestModel(
)

object CreateAssistantRequestModel {
  implicit lazy val createAssistantRequestModelJsonFormat: Format[CreateAssistantRequestModel] = Json.format[CreateAssistantRequestModel]
}

