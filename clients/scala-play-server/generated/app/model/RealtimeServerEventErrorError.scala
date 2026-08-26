package model

import play.api.libs.json._

/**
  * Details of the error.
  * @param `type` The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
  * @param code Error code, if any.
  * @param message A human-readable error message.
  * @param param Parameter related to the error, if any.
  * @param eventId The event_id of the client event that caused the error, if applicable. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RealtimeServerEventErrorError(
  `type`: String,
  code: Option[String],
  message: String,
  param: Option[String],
  eventId: Option[String]
)

object RealtimeServerEventErrorError {
  implicit lazy val realtimeServerEventErrorErrorJsonFormat: Format[RealtimeServerEventErrorError] = Json.format[RealtimeServerEventErrorError]
}

