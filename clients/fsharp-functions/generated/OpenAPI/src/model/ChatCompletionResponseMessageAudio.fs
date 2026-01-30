namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionResponseMessageAudio =

  //#region ChatCompletionResponseMessageAudio

  [<CLIMutable>]
  type ChatCompletionResponseMessageAudio = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "transcript")>]
    Transcript : string;
  }

  //#endregion
