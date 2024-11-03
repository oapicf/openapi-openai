
package org.openapitools.client.model


case class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation (
    /* The ID of the specific File the citation is from. */
    _fileId: Option[String],
    /* The specific quote in the file. */
    _quote: Option[String]
)
object MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    def toStringBody(var_fileId: Object, var_quote: Object) =
        s"""
        | {
        | "fileId":$var_fileId,"quote":$var_quote
        | }
        """.stripMargin
}
