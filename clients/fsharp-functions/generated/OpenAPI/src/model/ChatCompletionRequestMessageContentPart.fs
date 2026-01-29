namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImage
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImageImageUrl
open OpenAPI.Model.ChatCompletionRequestMessageContentPartText

module ChatCompletionRequestMessageContentPart =

  //#region ChatCompletionRequestMessageContentPart

  [<CLIMutable>]
  type ChatCompletionRequestMessageContentPart = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : ChatCompletionRequestMessageContentPartImageImageUrl;
  }

  //#endregion
