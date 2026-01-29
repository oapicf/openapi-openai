package api

import play.api.libs.json._
import model.CreateModerationRequest
import model.CreateModerationResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ModerationsApi {
  /**
    * Classifies if text is potentially harmful.
    */
  def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse
}
