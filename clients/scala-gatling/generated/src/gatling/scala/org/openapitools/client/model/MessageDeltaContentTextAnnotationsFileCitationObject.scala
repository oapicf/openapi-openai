
package org.openapitools.client.model


case class MessageDeltaContentTextAnnotationsFileCitationObject (
    /* The index of the annotation in the text content part. */
    _index: Integer,
    /* Always `file_citation`. */
    _type: String,
    /* The text in the message content that needs to be replaced. */
    _text: Option[String],
    _fileCitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation],
    _startIndex: Option[Integer],
    _endIndex: Option[Integer]
)
object MessageDeltaContentTextAnnotationsFileCitationObject {
    def toStringBody(var_index: Object, var_type: Object, var_text: Object, var_fileCitation: Object, var_startIndex: Object, var_endIndex: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"text":$var_text,"fileCitation":$var_fileCitation,"startIndex":$var_startIndex,"endIndex":$var_endIndex
        | }
        """.stripMargin
}
