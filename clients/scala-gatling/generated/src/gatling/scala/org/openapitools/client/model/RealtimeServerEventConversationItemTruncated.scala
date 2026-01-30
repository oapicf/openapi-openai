
package org.openapitools.client.model


case class RealtimeServerEventConversationItemTruncated (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `conversation.item.truncated`. */
    _type: String,
    /* The ID of the assistant message item that was truncated. */
    _itemId: String,
    /* The index of the content part that was truncated. */
    _contentIndex: Integer,
    /* The duration up to which the audio was truncated, in milliseconds.  */
    _audioEndMs: Integer
)
object RealtimeServerEventConversationItemTruncated {
    def toStringBody(var_eventId: Object, var_type: Object, var_itemId: Object, var_contentIndex: Object, var_audioEndMs: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"itemId":$var_itemId,"contentIndex":$var_contentIndex,"audioEndMs":$var_audioEndMs
        | }
        """.stripMargin
}
