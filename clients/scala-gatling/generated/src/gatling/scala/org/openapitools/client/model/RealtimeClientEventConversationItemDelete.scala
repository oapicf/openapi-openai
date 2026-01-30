
package org.openapitools.client.model


case class RealtimeClientEventConversationItemDelete (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `conversation.item.delete`. */
    _type: String,
    /* The ID of the item to delete. */
    _itemId: String
)
object RealtimeClientEventConversationItemDelete {
    def toStringBody(var_eventId: Object, var_type: Object, var_itemId: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"itemId":$var_itemId
        | }
        """.stripMargin
}
