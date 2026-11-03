package model

import play.api.libs.json._

/**
  * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateRunRequestModel(
)

object CreateRunRequestModel {
  implicit lazy val createRunRequestModelJsonFormat: Format[CreateRunRequestModel] = Json.format[CreateRunRequestModel]
}

