
package org.openapitools.client.model


case class MessageContentTextAnnotationsFileCitationObjectFileCitation (
    /* The ID of the specific File the citation is from. */
    _fileId: String,
    /* The specific quote in the file. */
    _quote: String
)
object MessageContentTextAnnotationsFileCitationObjectFileCitation {
    def toStringBody(var_fileId: Object, var_quote: Object) =
        s"""
        | {
        | "fileId":$var_fileId,"quote":$var_quote
        | }
        """.stripMargin
}
