namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageContentPartRefusal
open OpenAPI.Model.ChatCompletionRequestMessageContentPartText

module ChatCompletionRequestAssistantMessageContentPart =

  //#region ChatCompletionRequestAssistantMessageContentPart

  //#region enums
  type TypeEnum = TextEnum of string  |  RefusalEnum of string  
  //#endregion

  type ChatCompletionRequestAssistantMessageContentPart = {
    Type : TypeEnum;
    Text : string;
    Refusal : string;
  }
  //#endregion
