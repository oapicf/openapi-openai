namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CompletionUsage
open OpenAPI.Model.CreateChatCompletionFunctionResponseChoicesInner

module CreateChatCompletionFunctionResponse =

  //#region CreateChatCompletionFunctionResponse

  //#region enums
  type ObjectEnum = ChatCompletionEnum of string  
  //#endregion

  type CreateChatCompletionFunctionResponse = {
    Id : string;
    Choices : CreateChatCompletionFunctionResponseChoicesInner[];
    Created : int;
    Model : string;
    SystemFingerprint : string;
    Object : ObjectEnum;
    Usage : CompletionUsage;
  }
  //#endregion
