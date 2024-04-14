package api

import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse

/**
  * Provides a default implementation for [[ChatApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class ChatApiImpl extends ChatApi {
  /**
    * @inheritdoc
    */
  override def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse = {
    // TODO: Implement better logic

    CreateChatCompletionResponse("", List.empty[CreateChatCompletionResponseChoicesInner], 0, "", None, "", None)
  }
}
