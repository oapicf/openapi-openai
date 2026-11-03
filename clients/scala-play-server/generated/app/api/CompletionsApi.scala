package api

import play.api.libs.json._
import model.CreateCompletionRequest
import model.CreateCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
trait CompletionsApi {
  /**
    * Creates a completion for the provided prompt and parameters.
    */
  def createCompletion(createCompletionRequest: CreateCompletionRequest): CreateCompletionResponse
}
