package api

import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse

/**
  * Provides a default implementation for [[ChatApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ChatApiImpl extends ChatApi {
  /**
    * @inheritdoc
    */
  override def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse = {
    // TODO: Implement better logic

    CreateChatCompletionResponse("", List.empty[CreateChatCompletionResponseChoicesInner], 0, "", None, None, "", None)
  }
}
