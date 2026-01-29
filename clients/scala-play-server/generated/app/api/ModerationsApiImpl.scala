package api

import model.CreateModerationRequest
import model.CreateModerationResponse

/**
  * Provides a default implementation for [[ModerationsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ModerationsApiImpl extends ModerationsApi {
  /**
    * @inheritdoc
    */
  override def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse = {
    // TODO: Implement better logic

    CreateModerationResponse("", "", List.empty[CreateModerationResponseResultsInner])
  }
}
