package api

import model.CreateModerationRequest
import model.CreateModerationResponse

/**
  * Provides a default implementation for [[ModerationsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ModerationsApiImpl extends ModerationsApi {
  /**
    * @inheritdoc
    */
  override def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse = {
    // TODO: Implement better logic

    CreateModerationResponse("", "", List.empty[CreateModerationResponseResultsInner])
  }
}
