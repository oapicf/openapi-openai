namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionRequestSystemMessageContent

module ChatCompletionRequestSystemMessage =

  //#region ChatCompletionRequestSystemMessage

  [<CLIMutable>]
  type ChatCompletionRequestSystemMessage = {
    [<JsonProperty(PropertyName = "content")>]
    Content : ChatCompletionRequestSystemMessageContent;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
