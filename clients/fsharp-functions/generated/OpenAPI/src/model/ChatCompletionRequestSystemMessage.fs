namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestSystemMessage =

  //#region ChatCompletionRequestSystemMessage

  [<CLIMutable>]
  type ChatCompletionRequestSystemMessage = {
    [<JsonProperty(PropertyName = "content")>]
    Content : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
