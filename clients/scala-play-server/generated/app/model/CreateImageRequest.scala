package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateImageRequest.
  * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
  * @param n The number of images to generate. Must be between 1 and 10.
  * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
  * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateImageRequest(
  prompt: String,
  n: Option[Int],
  size: Option[CreateImageRequest.Size.Value],
  responseFormat: Option[CreateImageRequest.ResponseFormat.Value],
  user: Option[String]
)

object CreateImageRequest {
  implicit lazy val createImageRequestJsonFormat: Format[CreateImageRequest] = Json.format[CreateImageRequest]

  // noinspection TypeAnnotation
  object Size extends Enumeration {
    val _256x256 = Value("256x256")
    val _512x512 = Value("512x512")
    val _1024x1024 = Value("1024x1024")

    type Size = Value
    implicit lazy val SizeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ResponseFormat extends Enumeration {
    val Url = Value("url")
    val B64Json = Value("b64_json")

    type ResponseFormat = Value
    implicit lazy val ResponseFormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

