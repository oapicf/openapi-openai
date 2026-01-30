package model

import play.api.libs.json._

/**
  * Returned when the model-generated function call arguments are updated. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.function_call_arguments.delta`. 
  * @param responseId The ID of the response.
  * @param itemId The ID of the function call item.
  * @param outputIndex The index of the output item in the response.
  * @param callId The ID of the function call.
  * @param delta The arguments delta as a JSON string.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseFunctionCallArgumentsDelta(
  eventId: String,
  `type`: RealtimeServerEventResponseFunctionCallArgumentsDelta.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  callId: String,
  delta: String
)

object RealtimeServerEventResponseFunctionCallArgumentsDelta {
  implicit lazy val realtimeServerEventResponseFunctionCallArgumentsDeltaJsonFormat: Format[RealtimeServerEventResponseFunctionCallArgumentsDelta] = Json.format[RealtimeServerEventResponseFunctionCallArgumentsDelta]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseFunctionCallArgumentsDelta = Value("response.function_call_arguments.delta")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

