namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionMessageToolCallFunction =

  //#region ChatCompletionMessageToolCallFunction

  [<CLIMutable>]
  type ChatCompletionMessageToolCallFunction = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
  }

  //#endregion
