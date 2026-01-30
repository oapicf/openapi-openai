
package org.openapitools.client.model


case class RealtimeServerEventResponseAudioDone (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `response.audio.done`. */
    _type: String,
    /* The ID of the response. */
    _responseId: String,
    /* The ID of the item. */
    _itemId: String,
    /* The index of the output item in the response. */
    _outputIndex: Integer,
    /* The index of the content part in the item's content array. */
    _contentIndex: Integer
)
object RealtimeServerEventResponseAudioDone {
    def toStringBody(var_eventId: Object, var_type: Object, var_responseId: Object, var_itemId: Object, var_outputIndex: Object, var_contentIndex: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"responseId":$var_responseId,"itemId":$var_itemId,"outputIndex":$var_outputIndex,"contentIndex":$var_contentIndex
        | }
        """.stripMargin
}
