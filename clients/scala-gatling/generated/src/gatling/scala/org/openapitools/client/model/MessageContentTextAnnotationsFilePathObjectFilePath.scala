
package org.openapitools.client.model


case class MessageContentTextAnnotationsFilePathObjectFilePath (
    /* The ID of the file that was generated. */
    _fileId: String
)
object MessageContentTextAnnotationsFilePathObjectFilePath {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
