package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteModelResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeleteModelResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)

object DeleteModelResponse {
  implicit lazy val deleteModelResponseJsonFormat: Format[DeleteModelResponse] = Json.format[DeleteModelResponse]
}

