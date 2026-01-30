
package org.openapitools.client.model


case class RealtimeServerEventResponseFunctionCallArgumentsDone (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `response.function_call_arguments.done`.  */
    _type: String,
    /* The ID of the response. */
    _responseId: String,
    /* The ID of the function call item. */
    _itemId: String,
    /* The index of the output item in the response. */
    _outputIndex: Integer,
    /* The ID of the function call. */
    _callId: String,
    /* The final arguments as a JSON string. */
    _arguments: String
)
object RealtimeServerEventResponseFunctionCallArgumentsDone {
    def toStringBody(var_eventId: Object, var_type: Object, var_responseId: Object, var_itemId: Object, var_outputIndex: Object, var_callId: Object, var_arguments: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"responseId":$var_responseId,"itemId":$var_itemId,"outputIndex":$var_outputIndex,"callId":$var_callId,"arguments":$var_arguments
        | }
        """.stripMargin
}
