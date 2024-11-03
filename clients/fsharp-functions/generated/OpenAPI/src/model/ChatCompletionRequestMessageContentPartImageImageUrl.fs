namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestMessageContentPartImageImageUrl =

  //#region ChatCompletionRequestMessageContentPartImageImageUrl

  [<CLIMutable>]
  type ChatCompletionRequestMessageContentPartImageImageUrl = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "detail")>]
    Detail : string;
  }

  //#endregion
