package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteModelResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteModelResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)

object DeleteModelResponse {
  implicit lazy val deleteModelResponseJsonFormat: Format[DeleteModelResponse] = Json.format[DeleteModelResponse]
}

