namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestMessageContentPartRefusal =

  //#region ChatCompletionRequestMessageContentPartRefusal

  [<CLIMutable>]
  type ChatCompletionRequestMessageContentPartRefusal = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string;
  }

  //#endregion
