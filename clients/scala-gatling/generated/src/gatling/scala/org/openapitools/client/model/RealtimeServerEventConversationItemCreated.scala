
package org.openapitools.client.model


case class RealtimeServerEventConversationItemCreated (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `conversation.item.created`. */
    _type: String,
    /* The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  */
    _previousItemId: String,
    _item: RealtimeConversationItem
)
object RealtimeServerEventConversationItemCreated {
    def toStringBody(var_eventId: Object, var_type: Object, var_previousItemId: Object, var_item: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"previousItemId":$var_previousItemId,"item":$var_item
        | }
        """.stripMargin
}
