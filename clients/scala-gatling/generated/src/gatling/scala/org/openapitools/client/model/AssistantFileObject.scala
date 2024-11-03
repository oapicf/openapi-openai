
package org.openapitools.client.model


case class AssistantFileObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `assistant.file`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the assistant file was created. */
    _createdAt: Integer,
    /* The assistant ID that the file is attached to. */
    _assistantId: String
)
object AssistantFileObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_assistantId: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"assistantId":$var_assistantId
        | }
        """.stripMargin
}
