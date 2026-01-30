namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeConversationItem
open OpenAPI.Model.RealtimeResponseCreateParamsConversation
open OpenAPI.Model.RealtimeResponseCreateParamsMaxResponseOutputTokens
open OpenAPI.Model.RealtimeResponseCreateParamsToolsInner

module RealtimeResponseCreateParams =

  //#region RealtimeResponseCreateParams

  //#region enums
  type ModalitiesEnum[] = TextEnum of string[]  |  AudioEnum of string[]  
  //#endregion
  //#region enums
  type VoiceEnum = AlloyEnum of string  |  AshEnum of string  |  BalladEnum of string  |  CoralEnum of string  |  EchoEnum of string  |  SageEnum of string  |  ShimmerEnum of string  |  VerseEnum of string  
  //#endregion
  //#region enums
  type OutputAudioFormatEnum = Pcm16Enum of string  |  G711UlawEnum of string  |  G711AlawEnum of string  
  //#endregion

  type RealtimeResponseCreateParams = {
    Modalities : ModalitiesEnum[];
    Instructions : string;
    Voice : VoiceEnum;
    OutputAudioFormat : OutputAudioFormatEnum;
    Tools : RealtimeResponseCreateParamsToolsInner[];
    ToolChoice : string;
    Temperature : decimal;
    MaxResponseOutputTokens : RealtimeResponseCreateParamsMaxResponseOutputTokens;
    Conversation : RealtimeResponseCreateParamsConversation;
    Metadata : obj;
    Input : RealtimeConversationItem[];
  }
  //#endregion
