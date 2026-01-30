package model

import play.api.libs.json._

/**
  * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.function_call_arguments.done`. 
  * @param responseId The ID of the response.
  * @param itemId The ID of the function call item.
  * @param outputIndex The index of the output item in the response.
  * @param callId The ID of the function call.
  * @param arguments The final arguments as a JSON string.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseFunctionCallArgumentsDone(
  eventId: String,
  `type`: RealtimeServerEventResponseFunctionCallArgumentsDone.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  callId: String,
  arguments: String
)

object RealtimeServerEventResponseFunctionCallArgumentsDone {
  implicit lazy val realtimeServerEventResponseFunctionCallArgumentsDoneJsonFormat: Format[RealtimeServerEventResponseFunctionCallArgumentsDone] = Json.format[RealtimeServerEventResponseFunctionCallArgumentsDone]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseFunctionCallArgumentsDone = Value("response.function_call_arguments.done")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

