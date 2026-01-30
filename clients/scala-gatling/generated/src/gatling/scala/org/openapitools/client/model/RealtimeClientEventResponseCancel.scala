
package org.openapitools.client.model


case class RealtimeClientEventResponseCancel (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `response.cancel`. */
    _type: String,
    /* A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  */
    _responseId: Option[String]
)
object RealtimeClientEventResponseCancel {
    def toStringBody(var_eventId: Object, var_type: Object, var_responseId: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"responseId":$var_responseId
        | }
        """.stripMargin
}
