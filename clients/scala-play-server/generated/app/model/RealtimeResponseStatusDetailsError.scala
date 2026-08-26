package model

import play.api.libs.json._

/**
  * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
  * @param `type` The type of error.
  * @param code Error code, if any.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RealtimeResponseStatusDetailsError(
  `type`: Option[String],
  code: Option[String]
)

object RealtimeResponseStatusDetailsError {
  implicit lazy val realtimeResponseStatusDetailsErrorJsonFormat: Format[RealtimeResponseStatusDetailsError] = Json.format[RealtimeResponseStatusDetailsError]
}

