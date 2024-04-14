
package org.openapitools.client.model


case class MessageContentTextAnnotationsFileCitationObject (
    /* Always `file_citation`. */
    _type: String,
    /* The text in the message content that needs to be replaced. */
    _text: String,
    _fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
    _startIndex: Integer,
    _endIndex: Integer
)
object MessageContentTextAnnotationsFileCitationObject {
    def toStringBody(var_type: Object, var_text: Object, var_fileCitation: Object, var_startIndex: Object, var_endIndex: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text,"fileCitation":$var_fileCitation,"startIndex":$var_startIndex,"endIndex":$var_endIndex
        | }
        """.stripMargin
}
