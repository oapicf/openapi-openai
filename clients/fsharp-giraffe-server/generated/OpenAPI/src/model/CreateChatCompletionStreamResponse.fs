namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateChatCompletionStreamResponseChoicesInner

module CreateChatCompletionStreamResponse =

  //#region CreateChatCompletionStreamResponse


  type CreateChatCompletionStreamResponse = {
    Id : string;
    Object : string;
    Created : int;
    Model : string;
    Choices : CreateChatCompletionStreamResponseChoicesInner[];
  }
  //#endregion
