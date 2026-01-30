namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchObjectFileSearch

module RunStepDetailsToolCallsFileSearchObject =

  //#region RunStepDetailsToolCallsFileSearchObject

  //#region enums
  type TypeEnum = FileSearchEnum of string  
  //#endregion

  type RunStepDetailsToolCallsFileSearchObject = {
    Id : string;
    Type : TypeEnum;
    FileSearch : RunStepDetailsToolCallsFileSearchObjectFileSearch;
  }
  //#endregion
