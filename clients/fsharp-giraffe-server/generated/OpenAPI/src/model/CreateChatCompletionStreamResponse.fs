namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateChatCompletionStreamResponseChoicesInner
open OpenAPI.Model.CreateChatCompletionStreamResponseUsage
open OpenAPI.Model.string option

module CreateChatCompletionStreamResponse =

  //#region CreateChatCompletionStreamResponse

  //#region enums
  type ServiceTierEnum = ScaleEnum of string option  |  DefaultEnum of string option  
  //#endregion
  //#region enums
  type ObjectEnum = ChatCompletionChunkEnum of string  
  //#endregion

  type CreateChatCompletionStreamResponse = {
    Id : string;
    Choices : CreateChatCompletionStreamResponseChoicesInner[];
    Created : int;
    Model : string;
    ServiceTier : ServiceTierEnum;
    SystemFingerprint : string;
    Object : ObjectEnum;
    Usage : CreateChatCompletionStreamResponseUsage;
  }
  //#endregion
