package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextObject_text_annotations_inner.
  * @param `type` Always `file_citation`.
  * @param text The text in the message content that needs to be replaced.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageContentTextObjectTextAnnotationsInner(
  `type`: MessageContentTextObjectTextAnnotationsInner.Type.Value,
  text: String,
  fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
  startIndex: Int,
  endIndex: Int,
  filePath: MessageContentTextAnnotationsFilePathObjectFilePath
)

object MessageContentTextObjectTextAnnotationsInner {
  implicit lazy val messageContentTextObjectTextAnnotationsInnerJsonFormat: Format[MessageContentTextObjectTextAnnotationsInner] = Json.format[MessageContentTextObjectTextAnnotationsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FileCitation = Value("file_citation")
    val FilePath = Value("file_path")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

