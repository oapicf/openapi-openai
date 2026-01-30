
package org.openapitools.client.model


case class MessageContentImageFileObjectImageFile (
    /* The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content. */
    _fileId: String,
    /* Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`. */
    _detail: Option[String]
)
object MessageContentImageFileObjectImageFile {
    def toStringBody(var_fileId: Object, var_detail: Object) =
        s"""
        | {
        | "fileId":$var_fileId,"detail":$var_detail
        | }
        """.stripMargin
}
