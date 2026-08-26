package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteModelResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DeleteModelResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)

object DeleteModelResponse {
  implicit lazy val deleteModelResponseJsonFormat: Format[DeleteModelResponse] = Json.format[DeleteModelResponse]
}

