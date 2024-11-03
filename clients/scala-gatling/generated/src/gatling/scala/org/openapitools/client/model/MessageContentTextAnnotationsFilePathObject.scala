
package org.openapitools.client.model


case class MessageContentTextAnnotationsFilePathObject (
    /* Always `file_path`. */
    _type: String,
    /* The text in the message content that needs to be replaced. */
    _text: String,
    _filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
    _startIndex: Integer,
    _endIndex: Integer
)
object MessageContentTextAnnotationsFilePathObject {
    def toStringBody(var_type: Object, var_text: Object, var_filePath: Object, var_startIndex: Object, var_endIndex: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text,"filePath":$var_filePath,"startIndex":$var_startIndex,"endIndex":$var_endIndex
        | }
        """.stripMargin
}
