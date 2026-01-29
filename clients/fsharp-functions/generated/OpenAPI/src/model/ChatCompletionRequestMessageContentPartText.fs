namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestMessageContentPartText =

  //#region ChatCompletionRequestMessageContentPartText

  [<CLIMutable>]
  type ChatCompletionRequestMessageContentPartText = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
