package api

import play.api.libs.json._
import model.CreateModerationRequest
import model.CreateModerationResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait ModerationsApi {
  /**
    * Classifies if text is potentially harmful.
    */
  def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse
}
