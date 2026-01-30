package model

import play.api.libs.json._

/**
  * References an image URL in the content of a message.
  * @param `type` The type of the content part.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageContentImageUrlObject(
  `type`: MessageContentImageUrlObject.Type.Value,
  imageUrl: MessageContentImageUrlObjectImageUrl
)

object MessageContentImageUrlObject {
  implicit lazy val messageContentImageUrlObjectJsonFormat: Format[MessageContentImageUrlObject] = Json.format[MessageContentImageUrlObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageUrl = Value("image_url")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

