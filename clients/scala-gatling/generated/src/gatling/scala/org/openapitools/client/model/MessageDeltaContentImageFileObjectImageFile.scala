
package org.openapitools.client.model


case class MessageDeltaContentImageFileObjectImageFile (
    /* The [File](/docs/api-reference/files) ID of the image in the message content. */
    _fileId: Option[String]
)
object MessageDeltaContentImageFileObjectImageFile {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
