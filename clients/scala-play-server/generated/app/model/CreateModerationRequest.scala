package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationRequest(
  input: CreateModerationRequestInput,
  model: Option[CreateModerationRequestModel]
)

object CreateModerationRequest {
  implicit lazy val createModerationRequestJsonFormat: Format[CreateModerationRequest] = Json.format[CreateModerationRequest]
}

