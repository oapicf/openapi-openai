namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageContentPartAudioInputAudio

module ChatCompletionRequestMessageContentPartAudio =

  //#region ChatCompletionRequestMessageContentPartAudio

  [<CLIMutable>]
  type ChatCompletionRequestMessageContentPartAudio = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "input_audio")>]
    InputAudio : ChatCompletionRequestMessageContentPartAudioInputAudio;
  }

  //#endregion
