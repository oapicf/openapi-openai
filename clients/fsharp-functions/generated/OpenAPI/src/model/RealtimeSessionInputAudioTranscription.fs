namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeSessionInputAudioTranscription =

  //#region RealtimeSessionInputAudioTranscription

  [<CLIMutable>]
  type RealtimeSessionInputAudioTranscription = {
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
  }

  //#endregion
