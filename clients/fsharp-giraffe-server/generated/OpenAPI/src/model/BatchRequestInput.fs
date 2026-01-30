namespace OpenAPI.Model

open System
open System.Collections.Generic

module BatchRequestInput =

  //#region BatchRequestInput

  //#region enums
  type MethodEnum = POSTEnum of string  
  //#endregion

  type BatchRequestInput = {
    CustomId : string;
    Method : MethodEnum;
    Url : string;
  }
  //#endregion
