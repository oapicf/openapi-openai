package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateImageRequest.
  * @param prompt A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
  * @param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
  * @param quality The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
  * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  * @param style The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
  * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateImageRequest(
  prompt: String,
  model: Option[CreateImageRequestModel],
  n: Option[Int],
  quality: Option[CreateImageRequest.Quality.Value],
  responseFormat: Option[CreateImageRequest.ResponseFormat.Value],
  size: Option[CreateImageRequest.Size.Value],
  style: Option[CreateImageRequest.Style.Value],
  user: Option[String]
)

object CreateImageRequest {
  implicit lazy val createImageRequestJsonFormat: Format[CreateImageRequest] = Json.format[CreateImageRequest]

  // noinspection TypeAnnotation
  object Quality extends Enumeration {
    val Standard = Value("standard")
    val Hd = Value("hd")

    type Quality = Value
    implicit lazy val QualityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ResponseFormat extends Enumeration {
    val Url = Value("url")
    val B64Json = Value("b64_json")

    type ResponseFormat = Value
    implicit lazy val ResponseFormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Size extends Enumeration {
    val _256x256 = Value("256x256")
    val _512x512 = Value("512x512")
    val _1024x1024 = Value("1024x1024")
    val _1792x1024 = Value("1792x1024")
    val _1024x1792 = Value("1024x1792")

    type Size = Value
    implicit lazy val SizeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Style extends Enumeration {
    val Vivid = Value("vivid")
    val Natural = Value("natural")

    type Style = Value
    implicit lazy val StyleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

