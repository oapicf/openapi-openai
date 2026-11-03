package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateTranslationResponseJson.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateTranslationResponseJson(
  text: String
)

object CreateTranslationResponseJson {
  implicit lazy val createTranslationResponseJsonJsonFormat: Format[CreateTranslationResponseJson] = Json.format[CreateTranslationResponseJson]
}

