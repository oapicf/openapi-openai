namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeResponseCreateParamsMaxResponseOutputTokens
open OpenAPI.Model.RealtimeResponseCreateParamsToolsInner
open OpenAPI.Model.RealtimeSessionInputAudioTranscription
open OpenAPI.Model.RealtimeSessionModel
open OpenAPI.Model.RealtimeSessionTurnDetection

module RealtimeSession =

  //#region RealtimeSession

  [<CLIMutable>]
  type RealtimeSession = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "modalities")>]
    Modalities : string[];
    [<JsonProperty(PropertyName = "model")>]
    Model : RealtimeSessionModel;
    [<JsonProperty(PropertyName = "instructions")>]
    Instructions : string;
    [<JsonProperty(PropertyName = "voice")>]
    Voice : string;
    [<JsonProperty(PropertyName = "input_audio_format")>]
    InputAudioFormat : string;
    [<JsonProperty(PropertyName = "output_audio_format")>]
    OutputAudioFormat : string;
    [<JsonProperty(PropertyName = "input_audio_transcription")>]
    InputAudioTranscription : RealtimeSessionInputAudioTranscription;
    [<JsonProperty(PropertyName = "turn_detection")>]
    TurnDetection : RealtimeSessionTurnDetection;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : RealtimeResponseCreateParamsToolsInner[];
    [<JsonProperty(PropertyName = "tool_choice")>]
    ToolChoice : string;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal;
    [<JsonProperty(PropertyName = "max_response_output_tokens")>]
    MaxResponseOutputTokens : RealtimeResponseCreateParamsMaxResponseOutputTokens;
  }

  //#endregion
