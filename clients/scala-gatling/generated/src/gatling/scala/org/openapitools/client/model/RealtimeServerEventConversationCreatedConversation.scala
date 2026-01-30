
package org.openapitools.client.model


case class RealtimeServerEventConversationCreatedConversation (
    /* The unique ID of the conversation. */
    _id: Option[String],
    /* The object type, must be `realtime.conversation`. */
    _object: Option[String]
)
object RealtimeServerEventConversationCreatedConversation {
    def toStringBody(var_id: Object, var_object: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object
        | }
        """.stripMargin
}
