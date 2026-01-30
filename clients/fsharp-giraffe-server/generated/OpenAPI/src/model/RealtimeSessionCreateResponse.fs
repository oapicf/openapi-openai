namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponseCreateParamsMaxResponseOutputTokens
open OpenAPI.Model.RealtimeResponseCreateParamsToolsInner
open OpenAPI.Model.RealtimeSessionCreateResponseClientSecret
open OpenAPI.Model.RealtimeSessionCreateResponseTurnDetection
open OpenAPI.Model.RealtimeSessionInputAudioTranscription

module RealtimeSessionCreateResponse =

  //#region RealtimeSessionCreateResponse

  //#region enums
  type ModalitiesEnum[] = TextEnum of string[]  |  AudioEnum of string[]  
  //#endregion
  //#region enums
  type VoiceEnum = AlloyEnum of string  |  AshEnum of string  |  BalladEnum of string  |  CoralEnum of string  |  EchoEnum of string  |  SageEnum of string  |  ShimmerEnum of string  |  VerseEnum of string  
  //#endregion

  type RealtimeSessionCreateResponse = {
    ClientSecret : RealtimeSessionCreateResponseClientSecret;
    Modalities : ModalitiesEnum[];
    Instructions : string;
    Voice : VoiceEnum;
    InputAudioFormat : string;
    OutputAudioFormat : string;
    InputAudioTranscription : RealtimeSessionInputAudioTranscription;
    TurnDetection : RealtimeSessionCreateResponseTurnDetection;
    Tools : RealtimeResponseCreateParamsToolsInner[];
    ToolChoice : string;
    Temperature : decimal;
    MaxResponseOutputTokens : RealtimeResponseCreateParamsMaxResponseOutputTokens;
  }
  //#endregion
