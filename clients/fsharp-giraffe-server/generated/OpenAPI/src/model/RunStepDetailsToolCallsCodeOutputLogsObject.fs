namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepDetailsToolCallsCodeOutputLogsObject =

  //#region RunStepDetailsToolCallsCodeOutputLogsObject

  //#region enums
  type TypeEnum = LogsEnum of string  
  //#endregion

  type RunStepDetailsToolCallsCodeOutputLogsObject = {
    Type : TypeEnum;
    Logs : string;
  }
  //#endregion
