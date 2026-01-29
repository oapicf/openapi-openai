namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
open OpenAPI.Model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

module RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =

  //#region RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

  //#region enums
  type TypeEnum = LogsEnum of string  |  ImageEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner = {
    Index : int;
    Type : TypeEnum;
    Logs : string;
    Image : RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
  }
  //#endregion
