package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateModerationRequest(
  input: CreateModerationRequestInput,
  model: Option[CreateModerationRequestModel]
)

object CreateModerationRequest {
  implicit lazy val createModerationRequestJsonFormat: Format[CreateModerationRequest] = Json.format[CreateModerationRequest]
}

