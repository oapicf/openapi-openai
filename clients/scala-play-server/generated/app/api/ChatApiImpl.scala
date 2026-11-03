package api

import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse

/**
  * Provides a default implementation for [[ChatApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class ChatApiImpl extends ChatApi {
  /**
    * @inheritdoc
    */
  override def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse = {
    // TODO: Implement better logic

    CreateChatCompletionResponse("", List.empty[CreateChatCompletionResponseChoicesInner], 0, "", None, None, "", None)
  }
}
