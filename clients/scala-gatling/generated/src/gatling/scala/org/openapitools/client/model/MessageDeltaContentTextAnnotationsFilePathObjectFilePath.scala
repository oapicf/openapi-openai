
package org.openapitools.client.model


case class MessageDeltaContentTextAnnotationsFilePathObjectFilePath (
    /* The ID of the file that was generated. */
    _fileId: Option[String]
)
object MessageDeltaContentTextAnnotationsFilePathObjectFilePath {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
