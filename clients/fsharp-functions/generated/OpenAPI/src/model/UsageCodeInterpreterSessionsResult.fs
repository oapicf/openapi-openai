namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module UsageCodeInterpreterSessionsResult =

  //#region UsageCodeInterpreterSessionsResult

  [<CLIMutable>]
  type UsageCodeInterpreterSessionsResult = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "sessions")>]
    Sessions : int;
    [<JsonProperty(PropertyName = "project_id")>]
    ProjectId : string option;
  }

  //#endregion
