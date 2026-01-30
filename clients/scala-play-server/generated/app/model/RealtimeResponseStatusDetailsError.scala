package model

import play.api.libs.json._

/**
  * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
  * @param `type` The type of error.
  * @param code Error code, if any.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeResponseStatusDetailsError(
  `type`: Option[String],
  code: Option[String]
)

object RealtimeResponseStatusDetailsError {
  implicit lazy val realtimeResponseStatusDetailsErrorJsonFormat: Format[RealtimeResponseStatusDetailsError] = Json.format[RealtimeResponseStatusDetailsError]
}

