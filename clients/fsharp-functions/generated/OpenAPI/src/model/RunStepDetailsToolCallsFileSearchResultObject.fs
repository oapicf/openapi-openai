namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchResultObjectContentInner

module RunStepDetailsToolCallsFileSearchResultObject =

  //#region RunStepDetailsToolCallsFileSearchResultObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsFileSearchResultObject = {
    [<JsonProperty(PropertyName = "file_id")>]
    FileId : string;
    [<JsonProperty(PropertyName = "file_name")>]
    FileName : string;
    [<JsonProperty(PropertyName = "score")>]
    Score : decimal;
    [<JsonProperty(PropertyName = "content")>]
    Content : RunStepDetailsToolCallsFileSearchResultObjectContentInner[];
  }

  //#endregion
