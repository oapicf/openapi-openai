namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepDeltaStepDetailsToolCallsRetrievalObject =

  //#region RunStepDeltaStepDetailsToolCallsRetrievalObject

  //#region enums
  type TypeEnum = RetrievalEnum of string  
  //#endregion

  type RunStepDeltaStepDetailsToolCallsRetrievalObject = {
    Index : int;
    Id : string;
    Type : TypeEnum;
    Retrieval : obj;
  }
  //#endregion
