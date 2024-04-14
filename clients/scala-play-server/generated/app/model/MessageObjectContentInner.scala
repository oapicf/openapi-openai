package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageObject_content_inner.
  * @param `type` Always `image_file`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageObjectContentInner(
  `type`: MessageObjectContentInner.Type.Value,
  imageFile: MessageContentImageFileObjectImageFile,
  text: MessageContentTextObjectText
)

object MessageObjectContentInner {
  implicit lazy val messageObjectContentInnerJsonFormat: Format[MessageObjectContentInner] = Json.format[MessageObjectContentInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageFile = Value("image_file")
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

