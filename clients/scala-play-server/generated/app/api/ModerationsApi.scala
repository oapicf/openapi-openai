package api

import play.api.libs.json._
import model.CreateModerationRequest
import model.CreateModerationResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait ModerationsApi {
  /**
    * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    */
  def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse
}
