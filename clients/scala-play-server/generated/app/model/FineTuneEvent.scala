package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FineTuneEvent.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FineTuneEvent(
  `object`: String,
  createdAt: Int,
  level: String,
  message: String
)

object FineTuneEvent {
  implicit lazy val fineTuneEventJsonFormat: Format[FineTuneEvent] = Json.format[FineTuneEvent]
}

