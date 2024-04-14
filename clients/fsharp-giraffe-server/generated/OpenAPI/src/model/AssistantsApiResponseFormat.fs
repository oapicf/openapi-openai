namespace OpenAPI.Model

open System
open System.Collections.Generic

module AssistantsApiResponseFormat =

  //#region AssistantsApiResponseFormat

  //#region enums
  type TypeEnum = TextEnum of string  |  JsonObjectEnum of string  
  //#endregion

  type AssistantsApiResponseFormat = {
    Type : TypeEnum;
  }
  //#endregion
