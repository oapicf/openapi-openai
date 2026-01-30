package model

import play.api.libs.json._

/**
  * Additional details about the status.
  * @param `type` The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  * @param reason The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeResponseStatusDetails(
  `type`: Option[RealtimeResponseStatusDetails.Type.Value],
  reason: Option[RealtimeResponseStatusDetails.Reason.Value],
  error: Option[RealtimeResponseStatusDetailsError]
)

object RealtimeResponseStatusDetails {
  implicit lazy val realtimeResponseStatusDetailsJsonFormat: Format[RealtimeResponseStatusDetails] = Json.format[RealtimeResponseStatusDetails]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Completed = Value("completed")
    val Cancelled = Value("cancelled")
    val Failed = Value("failed")
    val Incomplete = Value("incomplete")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Reason extends Enumeration {
    val TurnDetected = Value("turn_detected")
    val ClientCancelled = Value("client_cancelled")
    val MaxOutputTokens = Value("max_output_tokens")
    val ContentFilter = Value("content_filter")

    type Reason = Value
    implicit lazy val ReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

