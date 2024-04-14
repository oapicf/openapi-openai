package model

import play.api.libs.json._

/**
  * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
  * @param `type` Always `file_citation`.
  * @param text The text in the message content that needs to be replaced.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageContentTextAnnotationsFileCitationObject(
  `type`: MessageContentTextAnnotationsFileCitationObject.Type.Value,
  text: String,
  fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
  startIndex: Int,
  endIndex: Int
)

object MessageContentTextAnnotationsFileCitationObject {
  implicit lazy val messageContentTextAnnotationsFileCitationObjectJsonFormat: Format[MessageContentTextAnnotationsFileCitationObject] = Json.format[MessageContentTextAnnotationsFileCitationObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FileCitation = Value("file_citation")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

