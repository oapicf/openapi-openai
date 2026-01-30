namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RealtimeConversationItem
open OpenAPI.Model.RealtimeResponseCreateParamsConversation
open OpenAPI.Model.RealtimeResponseCreateParamsMaxResponseOutputTokens
open OpenAPI.Model.RealtimeResponseCreateParamsToolsInner

module RealtimeResponseCreateParams =

  //#region RealtimeResponseCreateParams

  [<CLIMutable>]
  type RealtimeResponseCreateParams = {
    [<JsonProperty(PropertyName = "modalities")>]
    Modalities : string[];
    [<JsonProperty(PropertyName = "instructions")>]
    Instructions : string;
    [<JsonProperty(PropertyName = "voice")>]
    Voice : string;
    [<JsonProperty(PropertyName = "output_audio_format")>]
    OutputAudioFormat : string;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : RealtimeResponseCreateParamsToolsInner[];
    [<JsonProperty(PropertyName = "tool_choice")>]
    ToolChoice : string;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal;
    [<JsonProperty(PropertyName = "max_response_output_tokens")>]
    MaxResponseOutputTokens : RealtimeResponseCreateParamsMaxResponseOutputTokens;
    [<JsonProperty(PropertyName = "conversation")>]
    Conversation : RealtimeResponseCreateParamsConversation;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
    [<JsonProperty(PropertyName = "input")>]
    Input : RealtimeConversationItem[];
  }

  //#endregion
