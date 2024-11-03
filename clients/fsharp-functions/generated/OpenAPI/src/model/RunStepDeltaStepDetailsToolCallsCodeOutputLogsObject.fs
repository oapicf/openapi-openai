namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject =

  //#region RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "logs")>]
    Logs : string;
  }

  //#endregion
