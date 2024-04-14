namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionStreamResponseDeltaFunctionCall =

  //#region ChatCompletionStreamResponseDeltaFunctionCall

  [<CLIMutable>]
  type ChatCompletionStreamResponseDeltaFunctionCall = {
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
