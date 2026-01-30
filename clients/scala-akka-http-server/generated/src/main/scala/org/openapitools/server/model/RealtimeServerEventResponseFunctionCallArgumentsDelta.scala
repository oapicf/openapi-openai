package org.openapitools.server.model


/**
 * Returned when the model-generated function call arguments are updated. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.function_call_arguments.delta`.  for example: ''null''
 * @param responseId The ID of the response. for example: ''null''
 * @param itemId The ID of the function call item. for example: ''null''
 * @param outputIndex The index of the output item in the response. for example: ''null''
 * @param callId The ID of the function call. for example: ''null''
 * @param delta The arguments delta as a JSON string. for example: ''null''
*/
final case class RealtimeServerEventResponseFunctionCallArgumentsDelta (
  eventId: String,
  `type`: String,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  callId: String,
  delta: String
)

