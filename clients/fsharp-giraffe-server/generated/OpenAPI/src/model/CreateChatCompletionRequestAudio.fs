namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateChatCompletionRequestAudio =

  //#region CreateChatCompletionRequestAudio

  //#region enums
  type VoiceEnum = AlloyEnum of string  |  AshEnum of string  |  BalladEnum of string  |  CoralEnum of string  |  EchoEnum of string  |  SageEnum of string  |  ShimmerEnum of string  |  VerseEnum of string  
  //#endregion
  //#region enums
  type FormatEnum = WavEnum of string  |  Mp3Enum of string  |  FlacEnum of string  |  OpusEnum of string  |  Pcm16Enum of string  
  //#endregion

  type CreateChatCompletionRequest_audio = {
    Voice : VoiceEnum;
    Format : FormatEnum;
  }
  //#endregion
