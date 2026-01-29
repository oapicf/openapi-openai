package api

import play.api.libs.json._
import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ChatApi {
  /**
    * Creates a model response for the given chat conversation.
    */
  def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse
}
