
package org.openapitools.client.model


case class RealtimeServerEventConversationItemDeleted (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `conversation.item.deleted`. */
    _type: String,
    /* The ID of the item that was deleted. */
    _itemId: String
)
object RealtimeServerEventConversationItemDeleted {
    def toStringBody(var_eventId: Object, var_type: Object, var_itemId: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"itemId":$var_itemId
        | }
        """.stripMargin
}
