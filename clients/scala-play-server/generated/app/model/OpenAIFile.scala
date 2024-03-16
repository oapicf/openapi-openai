package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OpenAIFile.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OpenAIFile(
  id: String,
  `object`: String,
  bytes: Int,
  createdAt: Int,
  filename: String,
  purpose: String,
  status: Option[String],
  statusDetails: Option[JsObject]
)

object OpenAIFile {
  implicit lazy val openAIFileJsonFormat: Format[OpenAIFile] = Json.format[OpenAIFile]
}

