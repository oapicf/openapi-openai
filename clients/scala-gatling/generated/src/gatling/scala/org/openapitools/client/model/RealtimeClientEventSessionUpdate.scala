
package org.openapitools.client.model


case class RealtimeClientEventSessionUpdate (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `session.update`. */
    _type: String,
    _session: RealtimeSessionCreateRequest
)
object RealtimeClientEventSessionUpdate {
    def toStringBody(var_eventId: Object, var_type: Object, var_session: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"session":$var_session
        | }
        """.stripMargin
}
