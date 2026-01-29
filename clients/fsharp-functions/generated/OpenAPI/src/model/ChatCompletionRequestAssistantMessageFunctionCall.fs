namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRequestAssistantMessageFunctionCall =

  //#region ChatCompletionRequestAssistantMessageFunctionCall

  [<CLIMutable>]
  type ChatCompletionRequestAssistantMessageFunctionCall = {
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
