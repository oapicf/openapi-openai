package api

import play.api.libs.json._
import model.CreateCompletionRequest
import model.CreateCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait CompletionsApi {
  /**
    * Creates a completion for the provided prompt and parameters.
    */
  def createCompletion(createCompletionRequest: CreateCompletionRequest): CreateCompletionResponse
}
