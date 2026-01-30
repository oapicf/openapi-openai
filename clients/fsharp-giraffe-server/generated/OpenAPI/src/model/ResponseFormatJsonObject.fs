namespace OpenAPI.Model

open System
open System.Collections.Generic

module ResponseFormatJsonObject =

  //#region ResponseFormatJsonObject

  //#region enums
  type TypeEnum = JsonObjectEnum of string  
  //#endregion

  type ResponseFormatJsonObject = {
    Type : TypeEnum;
  }
  //#endregion
