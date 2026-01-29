
package org.openapitools.client.model


case class MessageContentTextObjectTextAnnotationsInner (
    /* Always `file_citation`. */
    _type: String,
    /* The text in the message content that needs to be replaced. */
    _text: String,
    _fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
    _startIndex: Integer,
    _endIndex: Integer,
    _filePath: MessageContentTextAnnotationsFilePathObjectFilePath
)
object MessageContentTextObjectTextAnnotationsInner {
    def toStringBody(var_type: Object, var_text: Object, var_fileCitation: Object, var_startIndex: Object, var_endIndex: Object, var_filePath: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text,"fileCitation":$var_fileCitation,"startIndex":$var_startIndex,"endIndex":$var_endIndex,"filePath":$var_filePath
        | }
        """.stripMargin
}
