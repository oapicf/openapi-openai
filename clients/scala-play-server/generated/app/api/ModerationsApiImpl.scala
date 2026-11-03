package api

import model.CreateModerationRequest
import model.CreateModerationResponse

/**
  * Provides a default implementation for [[ModerationsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class ModerationsApiImpl extends ModerationsApi {
  /**
    * @inheritdoc
    */
  override def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse = {
    // TODO: Implement better logic

    CreateModerationResponse("", "", List.empty[CreateModerationResponseResultsInner])
  }
}
