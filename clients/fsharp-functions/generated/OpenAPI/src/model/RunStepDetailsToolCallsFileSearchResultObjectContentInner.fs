namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDetailsToolCallsFileSearchResultObjectContentInner =

  //#region RunStepDetailsToolCallsFileSearchResultObjectContentInner

  [<CLIMutable>]
  type RunStepDetailsToolCallsFileSearchResultObjectContentInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
