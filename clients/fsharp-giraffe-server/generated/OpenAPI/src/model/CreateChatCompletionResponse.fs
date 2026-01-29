namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CompletionUsage
open OpenAPI.Model.CreateChatCompletionResponseChoicesInner

module CreateChatCompletionResponse =

  //#region CreateChatCompletionResponse

  //#region enums
  type ObjectEnum = ChatCompletionEnum of string  
  //#endregion

  type CreateChatCompletionResponse = {
    Id : string;
    Choices : CreateChatCompletionResponseChoicesInner[];
    Created : int;
    Model : string;
    SystemFingerprint : string;
    Object : ObjectEnum;
    Usage : CompletionUsage;
  }
  //#endregion
