namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionFunctionCallOption =

  //#region ChatCompletionFunctionCallOption

  [<CLIMutable>]
  type ChatCompletionFunctionCallOption = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
