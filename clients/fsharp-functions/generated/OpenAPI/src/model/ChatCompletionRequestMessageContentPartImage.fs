namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImageImageUrl

module ChatCompletionRequestMessageContentPartImage =

  //#region ChatCompletionRequestMessageContentPartImage

  [<CLIMutable>]
  type ChatCompletionRequestMessageContentPartImage = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : ChatCompletionRequestMessageContentPartImageImageUrl;
  }

  //#endregion
