namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module RunStepDetailsToolCallsFunctionObjectFunction =

  //#region RunStepDetailsToolCallsFunctionObjectFunction

  [<CLIMutable>]
  type RunStepDetailsToolCallsFunctionObjectFunction = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "arguments")>]
    Arguments : string;
    [<JsonProperty(PropertyName = "output")>]
    Output : string option;
  }

  //#endregion
