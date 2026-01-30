
package org.openapitools.client.model


case class MessageObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `thread.message`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the message was created. */
    _createdAt: Integer,
    /* The [thread](/docs/api-reference/threads) ID that this message belongs to. */
    _threadId: String,
    /* The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. */
    _status: String,
    _incompleteDetails: MessageObjectIncompleteDetails,
    /* The Unix timestamp (in seconds) for when the message was completed. */
    _completedAt: Integer,
    /* The Unix timestamp (in seconds) for when the message was marked as incomplete. */
    _incompleteAt: Integer,
    /* The entity that produced the message. One of `user` or `assistant`. */
    _role: String,
    /* The content of the message in array of text and/or images. */
    _content: List[MessageObjectContentInner],
    /* If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. */
    _assistantId: String,
    /* The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. */
    _runId: String,
    /* A list of files attached to the message, and the tools they were added to. */
    _attachments: List[CreateMessageRequestAttachmentsInner],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Any
)
object MessageObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_threadId: Object, var_status: Object, var_incompleteDetails: Object, var_completedAt: Object, var_incompleteAt: Object, var_role: Object, var_content: Object, var_assistantId: Object, var_runId: Object, var_attachments: Object, var_metadata: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"threadId":$var_threadId,"status":$var_status,"incompleteDetails":$var_incompleteDetails,"completedAt":$var_completedAt,"incompleteAt":$var_incompleteAt,"role":$var_role,"content":$var_content,"assistantId":$var_assistantId,"runId":$var_runId,"attachments":$var_attachments,"metadata":$var_metadata
        | }
        """.stripMargin
}
