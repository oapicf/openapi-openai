namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageContentPartRefusal
open OpenAPI.Model.ChatCompletionRequestMessageContentPartText

module ChatCompletionRequestAssistantMessageContentPart =

  //#region ChatCompletionRequestAssistantMessageContentPart

  [<CLIMutable>]
  type ChatCompletionRequestAssistantMessageContentPart = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string;
  }

  //#endregion
