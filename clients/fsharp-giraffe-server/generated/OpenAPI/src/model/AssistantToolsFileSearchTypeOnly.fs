namespace OpenAPI.Model

open System
open System.Collections.Generic

module AssistantToolsFileSearchTypeOnly =

  //#region AssistantToolsFileSearchTypeOnly

  //#region enums
  type TypeEnum = FileSearchEnum of string  
  //#endregion

  type AssistantToolsFileSearchTypeOnly = {
    Type : TypeEnum;
  }
  //#endregion
