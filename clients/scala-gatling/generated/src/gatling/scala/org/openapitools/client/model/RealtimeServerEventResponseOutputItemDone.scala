
package org.openapitools.client.model


case class RealtimeServerEventResponseOutputItemDone (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `response.output_item.done`. */
    _type: String,
    /* The ID of the Response to which the item belongs. */
    _responseId: String,
    /* The index of the output item in the Response. */
    _outputIndex: Integer,
    _item: RealtimeConversationItem
)
object RealtimeServerEventResponseOutputItemDone {
    def toStringBody(var_eventId: Object, var_type: Object, var_responseId: Object, var_outputIndex: Object, var_item: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"responseId":$var_responseId,"outputIndex":$var_outputIndex,"item":$var_item
        | }
        """.stripMargin
}
