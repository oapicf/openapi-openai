namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionResponseMessageFunctionCall =

  //#region ChatCompletionResponseMessageFunctionCall

  [<CLIMutable>]
  type ChatCompletionResponseMessageFunctionCall = {
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
