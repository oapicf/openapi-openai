namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestMessageFunctionCall =

  //#region ChatCompletionRequestMessageFunctionCall

  [<CLIMutable>]
  type ChatCompletionRequestMessageFunctionCall = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
  }

  //#endregion
