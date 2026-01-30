
package org.openapitools.client.model


case class RealtimeServerEventResponseDone (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `response.done`. */
    _type: String,
    _response: RealtimeResponse
)
object RealtimeServerEventResponseDone {
    def toStringBody(var_eventId: Object, var_type: Object, var_response: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"response":$var_response
        | }
        """.stripMargin
}
