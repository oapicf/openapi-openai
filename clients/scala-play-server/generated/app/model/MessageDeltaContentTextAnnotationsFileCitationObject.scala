package model

import play.api.libs.json._

/**
  * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
  * @param index The index of the annotation in the text content part.
  * @param `type` Always `file_citation`.
  * @param text The text in the message content that needs to be replaced.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageDeltaContentTextAnnotationsFileCitationObject(
  index: Int,
  `type`: MessageDeltaContentTextAnnotationsFileCitationObject.Type.Value,
  text: Option[String],
  fileCitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation],
  startIndex: Option[Int],
  endIndex: Option[Int]
)

object MessageDeltaContentTextAnnotationsFileCitationObject {
  implicit lazy val messageDeltaContentTextAnnotationsFileCitationObjectJsonFormat: Format[MessageDeltaContentTextAnnotationsFileCitationObject] = Json.format[MessageDeltaContentTextAnnotationsFileCitationObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FileCitation = Value("file_citation")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

