package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImagesResponse_data_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ImagesResponseDataInner(
  url: Option[String],
  b64Json: Option[String]
)

object ImagesResponseDataInner {
  implicit lazy val imagesResponseDataInnerJsonFormat: Format[ImagesResponseDataInner] = Json.format[ImagesResponseDataInner]
}

