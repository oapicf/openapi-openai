
package org.openapitools.client.model


case class RealtimeServerEventConversationCreated (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `conversation.created`. */
    _type: String,
    _conversation: RealtimeServerEventConversationCreatedConversation
)
object RealtimeServerEventConversationCreated {
    def toStringBody(var_eventId: Object, var_type: Object, var_conversation: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"conversation":$var_conversation
        | }
        """.stripMargin
}
