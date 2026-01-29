namespace OpenAPI.Model

open System
open System.Collections.Generic

module AssistantToolsRetrieval =

  //#region AssistantToolsRetrieval

  //#region enums
  type TypeEnum = RetrievalEnum of string  
  //#endregion

  type AssistantToolsRetrieval = {
    Type : TypeEnum;
  }
  //#endregion
