namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputImageObject
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputImageObjectImage
open OpenAPI.Model.RunStepDetailsToolCallsCodeOutputLogsObject

module RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =

  //#region RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

  //#region enums
  type TypeEnum = LogsEnum of string  |  ImageEnum of string  
  //#endregion

  type RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner = {
    Type : TypeEnum;
    Logs : string;
    Image : RunStepDetailsToolCallsCodeOutputImageObjectImage;
  }
  //#endregion
