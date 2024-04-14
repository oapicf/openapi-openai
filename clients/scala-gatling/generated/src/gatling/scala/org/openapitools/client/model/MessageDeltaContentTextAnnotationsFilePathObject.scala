
package org.openapitools.client.model


case class MessageDeltaContentTextAnnotationsFilePathObject (
    /* The index of the annotation in the text content part. */
    _index: Integer,
    /* Always `file_path`. */
    _type: String,
    /* The text in the message content that needs to be replaced. */
    _text: Option[String],
    _filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath],
    _startIndex: Option[Integer],
    _endIndex: Option[Integer]
)
object MessageDeltaContentTextAnnotationsFilePathObject {
    def toStringBody(var_index: Object, var_type: Object, var_text: Object, var_filePath: Object, var_startIndex: Object, var_endIndex: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"text":$var_text,"filePath":$var_filePath,"startIndex":$var_startIndex,"endIndex":$var_endIndex
        | }
        """.stripMargin
}
