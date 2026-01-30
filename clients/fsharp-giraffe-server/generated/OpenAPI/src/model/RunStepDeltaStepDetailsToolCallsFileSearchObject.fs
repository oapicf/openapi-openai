namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepDeltaStepDetailsToolCallsFileSearchObject =

  //#region RunStepDeltaStepDetailsToolCallsFileSearchObject

  //#region enums
  type TypeEnum = FileSearchEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsFileSearchObject = {
    Index : int;
    Id : string;
    Type : TypeEnum;
    FileSearch : obj;
  }
  //#endregion
