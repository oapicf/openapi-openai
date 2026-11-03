package model

import play.api.libs.json._

/**
  * The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudioResponseFormat(
)

object AudioResponseFormat {
  implicit lazy val audioResponseFormatJsonFormat: Format[AudioResponseFormat] = Json.format[AudioResponseFormat]
}

