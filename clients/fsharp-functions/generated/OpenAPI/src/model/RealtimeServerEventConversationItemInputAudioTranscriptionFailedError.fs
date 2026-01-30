namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealtimeServerEventConversationItemInputAudioTranscriptionFailedError =

  //#region RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

  [<CLIMutable>]
  type RealtimeServerEventConversationItemInputAudioTranscriptionFailedError = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "param")>]
    Param : string;
  }

  //#endregion
