package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateModerationRequest(
  input: CreateModerationRequestInput,
  model: Option[CreateModerationRequestModel]
)

object CreateModerationRequest {
  implicit lazy val createModerationRequestJsonFormat: Format[CreateModerationRequest] = Json.format[CreateModerationRequest]
}

