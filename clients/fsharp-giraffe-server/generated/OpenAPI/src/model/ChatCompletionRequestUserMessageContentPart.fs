namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageContentPartAudio
open OpenAPI.Model.ChatCompletionRequestMessageContentPartAudioInputAudio
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImage
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImageImageUrl
open OpenAPI.Model.ChatCompletionRequestMessageContentPartText

module ChatCompletionRequestUserMessageContentPart =

  //#region ChatCompletionRequestUserMessageContentPart

  //#region enums
  type TypeEnum = TextEnum of string  |  ImageUrlEnum of string  |  InputAudioEnum of string  
  //#endregion

  type ChatCompletionRequestUserMessageContentPart = {
    Type : TypeEnum;
    Text : string;
    ImageUrl : ChatCompletionRequestMessageContentPartImageImageUrl;
    InputAudio : ChatCompletionRequestMessageContentPartAudioInputAudio;
  }
  //#endregion
