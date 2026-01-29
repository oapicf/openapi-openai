namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionMessageToolCallChunkFunction =

  //#region ChatCompletionMessageToolCallChunkFunction

  [<CLIMutable>]
  type ChatCompletionMessageToolCallChunkFunction = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
  }

  //#endregion
