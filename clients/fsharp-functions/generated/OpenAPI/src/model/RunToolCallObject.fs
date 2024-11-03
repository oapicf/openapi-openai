namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunToolCallObjectFunction

module RunToolCallObject =

  //#region RunToolCallObject

  [<CLIMutable>]
  type RunToolCallObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "function")>]
    Function : RunToolCallObjectFunction;
  }

  //#endregion
