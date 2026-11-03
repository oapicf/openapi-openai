package api

import model.CreateCompletionRequest
import model.CreateCompletionResponse

/**
  * Provides a default implementation for [[CompletionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class CompletionsApiImpl extends CompletionsApi {
  /**
    * @inheritdoc
    */
  override def createCompletion(createCompletionRequest: CreateCompletionRequest): CreateCompletionResponse = {
    // TODO: Implement better logic

    CreateCompletionResponse("", List.empty[CreateCompletionResponseChoicesInner], 0, "", None, "", None)
  }
}
