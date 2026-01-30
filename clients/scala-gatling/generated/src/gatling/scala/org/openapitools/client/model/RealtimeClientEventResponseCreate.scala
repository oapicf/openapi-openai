
package org.openapitools.client.model


case class RealtimeClientEventResponseCreate (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `response.create`. */
    _type: String,
    _response: Option[RealtimeResponseCreateParams]
)
object RealtimeClientEventResponseCreate {
    def toStringBody(var_eventId: Object, var_type: Object, var_response: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"response":$var_response
        | }
        """.stripMargin
}
