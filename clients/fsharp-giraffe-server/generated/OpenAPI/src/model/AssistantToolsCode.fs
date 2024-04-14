namespace OpenAPI.Model

open System
open System.Collections.Generic

module AssistantToolsCode =

  //#region AssistantToolsCode

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  
  //#endregion

  type AssistantToolsCode = {
    Type : TypeEnum;
  }
  //#endregion
