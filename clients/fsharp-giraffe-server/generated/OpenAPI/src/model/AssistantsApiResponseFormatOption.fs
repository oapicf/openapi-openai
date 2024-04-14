namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantsApiResponseFormat

module AssistantsApiResponseFormatOption =

  //#region AssistantsApiResponseFormatOption

  //#region enums
  type TypeEnum = TextEnum of string  |  JsonObjectEnum of string  
  //#endregion

  type AssistantsApiResponseFormatOption = {
    Type : TypeEnum;
  }
  //#endregion
