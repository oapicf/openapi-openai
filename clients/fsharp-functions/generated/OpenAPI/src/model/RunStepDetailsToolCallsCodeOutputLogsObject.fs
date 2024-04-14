namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDetailsToolCallsCodeOutputLogsObject =

  //#region RunStepDetailsToolCallsCodeOutputLogsObject

  [<CLIMutable>]
  type RunStepDetailsToolCallsCodeOutputLogsObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "logs")>]
    Logs : string;
  }

  //#endregion
