namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module ChatCompletionRequestFunctionMessage =

  //#region ChatCompletionRequestFunctionMessage

  [<CLIMutable>]
  type ChatCompletionRequestFunctionMessage = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : string option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
