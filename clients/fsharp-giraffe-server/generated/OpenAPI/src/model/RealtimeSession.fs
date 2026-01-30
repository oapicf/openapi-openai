namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponseCreateParamsMaxResponseOutputTokens
open OpenAPI.Model.RealtimeResponseCreateParamsToolsInner
open OpenAPI.Model.RealtimeSessionInputAudioTranscription
open OpenAPI.Model.RealtimeSessionModel
open OpenAPI.Model.RealtimeSessionTurnDetection

module RealtimeSession =

  //#region RealtimeSession

  //#region enums
  type ModalitiesEnum[] = TextEnum of string[]  |  AudioEnum of string[]  
  //#endregion
  //#region enums
  type VoiceEnum = AlloyEnum of string  |  AshEnum of string  |  BalladEnum of string  |  CoralEnum of string  |  EchoEnum of string  |  SageEnum of string  |  ShimmerEnum of string  |  VerseEnum of string  
  //#endregion
  //#region enums
  type InputAudioFormatEnum = Pcm16Enum of string  |  G711UlawEnum of string  |  G711AlawEnum of string  
  //#endregion
  //#region enums
  type OutputAudioFormatEnum = Pcm16Enum of string  |  G711UlawEnum of string  |  G711AlawEnum of string  
  //#endregion

  type RealtimeSession = {
    Id : string;
    Modalities : ModalitiesEnum[];
    Model : RealtimeSessionModel;
    Instructions : string;
    Voice : VoiceEnum;
    InputAudioFormat : InputAudioFormatEnum;
    OutputAudioFormat : OutputAudioFormatEnum;
    InputAudioTranscription : RealtimeSessionInputAudioTranscription;
    TurnDetection : RealtimeSessionTurnDetection;
    Tools : RealtimeResponseCreateParamsToolsInner[];
    ToolChoice : string;
    Temperature : decimal;
    MaxResponseOutputTokens : RealtimeResponseCreateParamsMaxResponseOutputTokens;
  }
  //#endregion
