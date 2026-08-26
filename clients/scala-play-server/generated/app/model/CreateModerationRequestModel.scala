package model

import play.api.libs.json._

/**
  * The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateModerationRequestModel(
)

object CreateModerationRequestModel {
  implicit lazy val createModerationRequestModelJsonFormat: Format[CreateModerationRequestModel] = Json.format[CreateModerationRequestModel]
}

