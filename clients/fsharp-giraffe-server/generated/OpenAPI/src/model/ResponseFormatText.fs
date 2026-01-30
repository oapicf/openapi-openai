namespace OpenAPI.Model

open System
open System.Collections.Generic

module ResponseFormatText =

  //#region ResponseFormatText

  //#region enums
  type TypeEnum = TextEnum of string  
  //#endregion

  type ResponseFormatText = {
    Type : TypeEnum;
  }
  //#endregion
