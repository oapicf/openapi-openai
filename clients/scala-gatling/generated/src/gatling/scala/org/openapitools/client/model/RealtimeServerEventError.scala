
package org.openapitools.client.model


case class RealtimeServerEventError (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `error`. */
    _type: String,
    _error: RealtimeServerEventErrorError
)
object RealtimeServerEventError {
    def toStringBody(var_eventId: Object, var_type: Object, var_error: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"error":$var_error
        | }
        """.stripMargin
}
