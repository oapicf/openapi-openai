
package org.openapitools.client.model


case class MessageFileObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `thread.message.file`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the message file was created. */
    _createdAt: Integer,
    /* The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. */
    _messageId: String
)
object MessageFileObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_messageId: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"messageId":$var_messageId
        | }
        """.stripMargin
}
