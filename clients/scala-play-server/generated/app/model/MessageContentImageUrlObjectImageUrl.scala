package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for MessageContentImageUrlObject_image_url.
  * @param url The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  * @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageContentImageUrlObjectImageUrl(
  url: URI,
  detail: Option[MessageContentImageUrlObjectImageUrl.Detail.Value]
)

object MessageContentImageUrlObjectImageUrl {
  implicit lazy val messageContentImageUrlObjectImageUrlJsonFormat: Format[MessageContentImageUrlObjectImageUrl] = Json.format[MessageContentImageUrlObjectImageUrl]

  // noinspection TypeAnnotation
  object Detail extends Enumeration {
    val Auto = Value("auto")
    val Low = Value("low")
    val High = Value("high")

    type Detail = Value
    implicit lazy val DetailJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

