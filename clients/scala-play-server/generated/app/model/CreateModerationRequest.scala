package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationRequest(
  input: CreateModerationRequestInput,
  model: Option[CreateModerationRequestModel]
)

object CreateModerationRequest {
  implicit lazy val createModerationRequestJsonFormat: Format[CreateModerationRequest] = Json.format[CreateModerationRequest]
}

