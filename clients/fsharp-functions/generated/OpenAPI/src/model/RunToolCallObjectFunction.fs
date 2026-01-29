namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunToolCallObjectFunction =

  //#region RunToolCallObjectFunction

  [<CLIMutable>]
  type RunToolCallObjectFunction = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
  }

  //#endregion
