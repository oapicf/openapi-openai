package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateModerationRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateModerationRequest(
  input: CreateModerationRequestInput,
  model: Option[CreateModerationRequestModel]
)

object CreateModerationRequest {
  implicit lazy val createModerationRequestJsonFormat: Format[CreateModerationRequest] = Json.format[CreateModerationRequest]
}

