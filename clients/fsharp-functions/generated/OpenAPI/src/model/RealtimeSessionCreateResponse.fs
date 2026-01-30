namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeResponseCreateParamsMaxResponseOutputTokens
open OpenAPI.Model.RealtimeResponseCreateParamsToolsInner
open OpenAPI.Model.RealtimeSessionCreateResponseClientSecret
open OpenAPI.Model.RealtimeSessionCreateResponseTurnDetection
open OpenAPI.Model.RealtimeSessionInputAudioTranscription

module RealtimeSessionCreateResponse =

  //#region RealtimeSessionCreateResponse

  [<CLIMutable>]
  type RealtimeSessionCreateResponse = {
    [<JsonProperty(PropertyName = "client_secret")>]
    ClientSecret : RealtimeSessionCreateResponseClientSecret;
    [<JsonProperty(PropertyName = "modalities")>]
    Modalities : string[];
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
    TurnDetection : RealtimeSessionCreateResponseTurnDetection;
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
