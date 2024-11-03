package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaContentTextObject_text_annotations_inner.
  * @param index The index of the annotation in the text content part.
  * @param `type` Always `file_citation`.
  * @param text The text in the message content that needs to be replaced.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageDeltaContentTextObjectTextAnnotationsInner(
  index: Int,
  `type`: MessageDeltaContentTextObjectTextAnnotationsInner.Type.Value,
  text: Option[String],
  fileCitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation],
  startIndex: Option[Int],
  endIndex: Option[Int],
  filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
)

object MessageDeltaContentTextObjectTextAnnotationsInner {
  implicit lazy val messageDeltaContentTextObjectTextAnnotationsInnerJsonFormat: Format[MessageDeltaContentTextObjectTextAnnotationsInner] = Json.format[MessageDeltaContentTextObjectTextAnnotationsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Citation = Value("file_citation")
    val Path = Value("file_path")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

