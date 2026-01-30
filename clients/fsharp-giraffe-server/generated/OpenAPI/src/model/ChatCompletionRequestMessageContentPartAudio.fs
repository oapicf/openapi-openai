namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageContentPartAudioInputAudio

module ChatCompletionRequestMessageContentPartAudio =

  //#region ChatCompletionRequestMessageContentPartAudio

  //#region enums
  type TypeEnum = InputAudioEnum of string  
  //#endregion

  type ChatCompletionRequestMessageContentPartAudio = {
    Type : TypeEnum;
    InputAudio : ChatCompletionRequestMessageContentPartAudioInputAudio;
  }
  //#endregion
