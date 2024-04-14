namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateChatCompletionStreamResponseChoicesInner

module CreateChatCompletionStreamResponse =

  //#region CreateChatCompletionStreamResponse

  //#region enums
  type ObjectEnum = ChatCompletionChunkEnum of string  
  //#endregion

  type CreateChatCompletionStreamResponse = {
    Id : string;
    Choices : CreateChatCompletionStreamResponseChoicesInner[];
    Created : int;
    Model : string;
    SystemFingerprint : string;
    Object : ObjectEnum;
  }
  //#endregion
