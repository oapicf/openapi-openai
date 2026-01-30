
package org.openapitools.client.model


case class RealtimeClientEventConversationItemCreate (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `conversation.item.create`. */
    _type: String,
    /* The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  */
    _previousItemId: Option[String],
    _item: RealtimeConversationItem
)
object RealtimeClientEventConversationItemCreate {
    def toStringBody(var_eventId: Object, var_type: Object, var_previousItemId: Object, var_item: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"previousItemId":$var_previousItemId,"item":$var_item
        | }
        """.stripMargin
}
