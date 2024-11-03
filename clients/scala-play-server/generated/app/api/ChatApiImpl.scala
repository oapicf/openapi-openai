package api

import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse

/**
  * Provides a default implementation for [[ChatApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class ChatApiImpl extends ChatApi {
  /**
    * @inheritdoc
    */
  override def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse = {
    // TODO: Implement better logic

    CreateChatCompletionResponse("", List.empty[CreateChatCompletionResponseChoicesInner], 0, "", None, "", None)
  }
}
