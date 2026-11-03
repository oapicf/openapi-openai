package model

import play.api.libs.json._
import java.net.URI

/**
  * Contains either an image URL or a data URL for a base64 encoded image.
  * @param url Either a URL of the image or the base64 encoded image data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateModerationRequestInputOneOfInnerOneOfImageUrl(
  url: URI
)

object CreateModerationRequestInputOneOfInnerOneOfImageUrl {
  implicit lazy val createModerationRequestInputOneOfInnerOneOfImageUrlJsonFormat: Format[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = Json.format[CreateModerationRequestInputOneOfInnerOneOfImageUrl]
}

