
package org.openapitools.client.model


case class MessageDeltaObjectDelta (
    /* The entity that produced the message. One of `user` or `assistant`. */
    _role: Option[String],
    /* The content of the message in array of text and/or images. */
    _content: Option[List[MessageDeltaObjectDeltaContentInner]],
    /* A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. */
    _fileIds: Option[List[String]]
)
object MessageDeltaObjectDelta {
    def toStringBody(var_role: Object, var_content: Object, var_fileIds: Object) =
        s"""
        | {
        | "role":$var_role,"content":$var_content,"fileIds":$var_fileIds
        | }
        """.stripMargin
}
