
package org.openapitools.client.model


case class RealtimeServerEventSessionCreated (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `session.created`. */
    _type: String,
    _session: RealtimeSession
)
object RealtimeServerEventSessionCreated {
    def toStringBody(var_eventId: Object, var_type: Object, var_session: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"session":$var_session
        | }
        """.stripMargin
}
