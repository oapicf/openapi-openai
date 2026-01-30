namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestMessageContentPartAudioInputAudio =

  //#region ChatCompletionRequestMessageContentPartAudioInputAudio

  [<CLIMutable>]
  type ChatCompletionRequestMessageContentPartAudioInputAudio = {
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "format")>]
    Format : string;
  }

  //#endregion
