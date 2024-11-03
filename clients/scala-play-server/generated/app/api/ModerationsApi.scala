package api

import play.api.libs.json._
import model.CreateModerationRequest
import model.CreateModerationResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait ModerationsApi {
  /**
    * Classifies if text is potentially harmful.
    */
  def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse
}
