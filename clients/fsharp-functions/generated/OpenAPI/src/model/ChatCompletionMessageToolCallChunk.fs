namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionMessageToolCallChunkFunction

module ChatCompletionMessageToolCallChunk =

  //#region ChatCompletionMessageToolCallChunk

  [<CLIMutable>]
  type ChatCompletionMessageToolCallChunk = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : ChatCompletionMessageToolCallChunkFunction;
  }

  //#endregion
