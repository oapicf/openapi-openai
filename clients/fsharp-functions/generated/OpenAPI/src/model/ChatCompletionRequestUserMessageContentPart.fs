namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageContentPartAudio
open OpenAPI.Model.ChatCompletionRequestMessageContentPartAudioInputAudio
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImage
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImageImageUrl
open OpenAPI.Model.ChatCompletionRequestMessageContentPartText

module ChatCompletionRequestUserMessageContentPart =

  //#region ChatCompletionRequestUserMessageContentPart

  [<CLIMutable>]
  type ChatCompletionRequestUserMessageContentPart = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : ChatCompletionRequestMessageContentPartImageImageUrl;
    [<JsonProperty(PropertyName = "input_audio")>]
    InputAudio : ChatCompletionRequestMessageContentPartAudioInputAudio;
  }

  //#endregion
