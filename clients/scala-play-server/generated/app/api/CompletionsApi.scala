package api

import play.api.libs.json._
import model.CreateCompletionRequest
import model.CreateCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CompletionsApi {
  /**
    * Creates a completion for the provided prompt and parameters.
    */
  def createCompletion(createCompletionRequest: CreateCompletionRequest): CreateCompletionResponse
}
