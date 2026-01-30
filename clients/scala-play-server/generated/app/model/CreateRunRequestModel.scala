package model

import play.api.libs.json._

/**
  * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateRunRequestModel(
)

object CreateRunRequestModel {
  implicit lazy val createRunRequestModelJsonFormat: Format[CreateRunRequestModel] = Json.format[CreateRunRequestModel]
}

