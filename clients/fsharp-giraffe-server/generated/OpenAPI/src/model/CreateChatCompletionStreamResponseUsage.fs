namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateChatCompletionStreamResponseUsage =

  //#region CreateChatCompletionStreamResponseUsage


  type CreateChatCompletionStreamResponse_usage = {
    CompletionTokens : int;
    PromptTokens : int;
    TotalTokens : int;
  }
  //#endregion
