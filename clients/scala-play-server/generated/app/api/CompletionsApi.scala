package api

import play.api.libs.json._
import model.CreateCompletionRequest
import model.CreateCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait CompletionsApi {
  /**
    * Creates a completion for the provided prompt and parameters.
    */
  def createCompletion(createCompletionRequest: CreateCompletionRequest): CreateCompletionResponse
}
