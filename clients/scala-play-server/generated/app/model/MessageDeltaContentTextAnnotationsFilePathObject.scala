package model

import play.api.libs.json._

/**
  * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
  * @param index The index of the annotation in the text content part.
  * @param `type` Always `file_path`.
  * @param text The text in the message content that needs to be replaced.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageDeltaContentTextAnnotationsFilePathObject(
  index: Int,
  `type`: MessageDeltaContentTextAnnotationsFilePathObject.Type.Value,
  text: Option[String],
  filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath],
  startIndex: Option[Int],
  endIndex: Option[Int]
)

object MessageDeltaContentTextAnnotationsFilePathObject {
  implicit lazy val messageDeltaContentTextAnnotationsFilePathObjectJsonFormat: Format[MessageDeltaContentTextAnnotationsFilePathObject] = Json.format[MessageDeltaContentTextAnnotationsFilePathObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FilePath = Value("file_path")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

