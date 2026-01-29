namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepDetailsToolCallsRetrievalObject =

  //#region RunStepDetailsToolCallsRetrievalObject

  //#region enums
  type TypeEnum = RetrievalEnum of string  
  //#endregion

  type RunStepDetailsToolCallsRetrievalObject = {
    Id : string;
    Type : TypeEnum;
    Retrieval : obj;
  }
  //#endregion
