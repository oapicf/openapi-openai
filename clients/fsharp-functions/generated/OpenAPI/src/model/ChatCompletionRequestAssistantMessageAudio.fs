namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestAssistantMessageAudio =

  //#region ChatCompletionRequestAssistantMessageAudio

  [<CLIMutable>]
  type ChatCompletionRequestAssistantMessageAudio = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
