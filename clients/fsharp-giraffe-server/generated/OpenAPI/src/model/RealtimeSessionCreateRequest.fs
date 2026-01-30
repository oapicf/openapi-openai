namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponseCreateParamsMaxResponseOutputTokens
open OpenAPI.Model.RealtimeResponseCreateParamsToolsInner
open OpenAPI.Model.RealtimeSessionCreateRequestTurnDetection
open OpenAPI.Model.RealtimeSessionInputAudioTranscription

module RealtimeSessionCreateRequest =

  //#region RealtimeSessionCreateRequest

  //#region enums
  type ModalitiesEnum[] = TextEnum of string[]  |  AudioEnum of string[]  
  //#endregion
  //#region enums
  type ModelEnum = Gpt4oRealtimePreviewEnum of string  |  Gpt4oRealtimePreview20241001Enum of string  |  Gpt4oRealtimePreview20241217Enum of string  |  Gpt4oMiniRealtimePreviewEnum of string  |  Gpt4oMiniRealtimePreview20241217Enum of string  
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

  type RealtimeSessionCreateRequest = {
    Modalities : ModalitiesEnum[];
    Model : ModelEnum;
    Instructions : string;
    Voice : VoiceEnum;
    InputAudioFormat : InputAudioFormatEnum;
    OutputAudioFormat : OutputAudioFormatEnum;
    InputAudioTranscription : RealtimeSessionInputAudioTranscription;
    TurnDetection : RealtimeSessionCreateRequestTurnDetection;
    Tools : RealtimeResponseCreateParamsToolsInner[];
    ToolChoice : string;
    Temperature : decimal;
    MaxResponseOutputTokens : RealtimeResponseCreateParamsMaxResponseOutputTokens;
  }
  //#endregion
