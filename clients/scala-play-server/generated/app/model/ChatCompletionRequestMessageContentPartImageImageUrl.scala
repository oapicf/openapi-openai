package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for ChatCompletionRequestMessageContentPartImage_image_url.
  * @param url Either a URL of the image or the base64 encoded image data.
  * @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionRequestMessageContentPartImageImageUrl(
  url: URI,
  detail: Option[ChatCompletionRequestMessageContentPartImageImageUrl.Detail.Value]
)

object ChatCompletionRequestMessageContentPartImageImageUrl {
  implicit lazy val chatCompletionRequestMessageContentPartImageImageUrlJsonFormat: Format[ChatCompletionRequestMessageContentPartImageImageUrl] = Json.format[ChatCompletionRequestMessageContentPartImageImageUrl]

  // noinspection TypeAnnotation
  object Detail extends Enumeration {
    val Auto = Value("auto")
    val Low = Value("low")
    val High = Value("high")

    type Detail = Value
    implicit lazy val DetailJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

