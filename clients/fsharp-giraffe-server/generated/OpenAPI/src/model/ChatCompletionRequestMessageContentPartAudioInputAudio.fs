namespace OpenAPI.Model

open System
open System.Collections.Generic

module ChatCompletionRequestMessageContentPartAudioInputAudio =

  //#region ChatCompletionRequestMessageContentPartAudioInputAudio

  //#region enums
  type FormatEnum = WavEnum of string  |  Mp3Enum of string  
  //#endregion

  type ChatCompletionRequestMessageContentPartAudio_input_audio = {
    Data : string;
    Format : FormatEnum;
  }
  //#endregion
