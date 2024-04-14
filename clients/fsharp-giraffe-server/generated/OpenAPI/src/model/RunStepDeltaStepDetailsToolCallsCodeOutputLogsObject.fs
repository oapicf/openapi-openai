namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject =

  //#region RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

  //#region enums
  type TypeEnum = LogsEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject = {
    Index : int;
    Type : TypeEnum;
    Logs : string;
  }
  //#endregion
