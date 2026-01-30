
package org.openapitools.client.model


case class RealtimeServerEventSessionUpdated (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `session.updated`. */
    _type: String,
    _session: RealtimeSession
)
object RealtimeServerEventSessionUpdated {
    def toStringBody(var_eventId: Object, var_type: Object, var_session: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"session":$var_session
        | }
        """.stripMargin
}
