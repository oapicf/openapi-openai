
package org.openapitools.client.model


case class MessageContentTextAnnotationsFileCitationObjectFileCitation (
    /* The ID of the specific File the citation is from. */
    _fileId: String
)
object MessageContentTextAnnotationsFileCitationObjectFileCitation {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
