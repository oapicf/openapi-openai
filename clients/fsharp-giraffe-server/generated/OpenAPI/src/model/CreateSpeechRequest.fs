namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateSpeechRequestModel

module CreateSpeechRequest =

  //#region CreateSpeechRequest

  //#region enums
  type VoiceEnum = AlloyEnum of string  |  EchoEnum of string  |  FableEnum of string  |  OnyxEnum of string  |  NovaEnum of string  |  ShimmerEnum of string  
  //#endregion
  //#region enums
  type ResponseFormatEnum = Mp3Enum of string  |  OpusEnum of string  |  AacEnum of string  |  FlacEnum of string  |  WavEnum of string  |  PcmEnum of string  
  //#endregion

  type CreateSpeechRequest = {
    Model : CreateSpeechRequestModel;
    Input : string;
    Voice : VoiceEnum;
    ResponseFormat : ResponseFormatEnum;
    Speed : decimal;
  }
  //#endregion
