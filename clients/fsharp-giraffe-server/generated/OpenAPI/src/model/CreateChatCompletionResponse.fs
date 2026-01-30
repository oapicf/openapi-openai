namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CompletionUsage
open OpenAPI.Model.CreateChatCompletionResponseChoicesInner
open OpenAPI.Model.string option

module CreateChatCompletionResponse =

  //#region CreateChatCompletionResponse

  //#region enums
  type ServiceTierEnum = ScaleEnum of string option  |  DefaultEnum of string option  
  //#endregion
  //#region enums
  type ObjectEnum = ChatCompletionEnum of string  
  //#endregion

  type CreateChatCompletionResponse = {
    Id : string;
    Choices : CreateChatCompletionResponseChoicesInner[];
    Created : int;
    Model : string;
    ServiceTier : ServiceTierEnum;
    SystemFingerprint : string;
    Object : ObjectEnum;
    Usage : CompletionUsage;
  }
  //#endregion
