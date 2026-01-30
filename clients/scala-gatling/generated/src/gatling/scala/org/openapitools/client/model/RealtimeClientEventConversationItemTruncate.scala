
package org.openapitools.client.model


case class RealtimeClientEventConversationItemTruncate (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `conversation.item.truncate`. */
    _type: String,
    /* The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  */
    _itemId: String,
    /* The index of the content part to truncate. Set this to 0. */
    _contentIndex: Integer,
    /* Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  */
    _audioEndMs: Integer
)
object RealtimeClientEventConversationItemTruncate {
    def toStringBody(var_eventId: Object, var_type: Object, var_itemId: Object, var_contentIndex: Object, var_audioEndMs: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"itemId":$var_itemId,"contentIndex":$var_contentIndex,"audioEndMs":$var_audioEndMs
        | }
        """.stripMargin
}
