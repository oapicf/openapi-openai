package model

import play.api.libs.json._

/**
  * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
  * @param `type` Always `file_path`.
  * @param text The text in the message content that needs to be replaced.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageContentTextAnnotationsFilePathObject(
  `type`: MessageContentTextAnnotationsFilePathObject.Type.Value,
  text: String,
  filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
  startIndex: Int,
  endIndex: Int
)

object MessageContentTextAnnotationsFilePathObject {
  implicit lazy val messageContentTextAnnotationsFilePathObjectJsonFormat: Format[MessageContentTextAnnotationsFilePathObject] = Json.format[MessageContentTextAnnotationsFilePathObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FilePath = Value("file_path")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

