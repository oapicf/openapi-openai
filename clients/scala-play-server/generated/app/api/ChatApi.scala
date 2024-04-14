package api

import play.api.libs.json._
import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait ChatApi {
  /**
    * Creates a model response for the given chat conversation.
    */
  def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse
}
