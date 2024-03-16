namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateChatCompletionResponseChoicesInner
open OpenAPI.Model.CreateCompletionResponseUsage

module CreateChatCompletionResponse =

  //#region CreateChatCompletionResponse


  type CreateChatCompletionResponse = {
    Id : string;
    Object : string;
    Created : int;
    Model : string;
    Choices : CreateChatCompletionResponseChoicesInner[];
    Usage : CreateCompletionResponseUsage;
  }
  //#endregion
