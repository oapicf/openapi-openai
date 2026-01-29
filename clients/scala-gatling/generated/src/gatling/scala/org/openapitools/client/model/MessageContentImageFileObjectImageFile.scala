
package org.openapitools.client.model


case class MessageContentImageFileObjectImageFile (
    /* The [File](/docs/api-reference/files) ID of the image in the message content. */
    _fileId: String
)
object MessageContentImageFileObjectImageFile {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
