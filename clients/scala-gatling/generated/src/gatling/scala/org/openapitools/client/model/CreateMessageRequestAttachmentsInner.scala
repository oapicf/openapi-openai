
package org.openapitools.client.model


case class CreateMessageRequestAttachmentsInner (
    /* The ID of the file to attach to the message. */
    _fileId: Option[String],
    /* The tools to add this file to. */
    _tools: Option[List[CreateMessageRequestAttachmentsInnerToolsInner]]
)
object CreateMessageRequestAttachmentsInner {
    def toStringBody(var_fileId: Object, var_tools: Object) =
        s"""
        | {
        | "fileId":$var_fileId,"tools":$var_tools
        | }
        """.stripMargin
}
