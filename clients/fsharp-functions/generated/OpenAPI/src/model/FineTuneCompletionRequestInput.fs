namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FineTuneCompletionRequestInput =

  //#region FineTuneCompletionRequestInput

  [<CLIMutable>]
  type FineTuneCompletionRequestInput = {
    [<JsonProperty(PropertyName = "prompt")>]
    Prompt : string;
    [<JsonProperty(PropertyName = "completion")>]
    Completion : string;
  }

  //#endregion
