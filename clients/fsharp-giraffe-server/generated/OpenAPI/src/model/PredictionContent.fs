namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PredictionContentContent

module PredictionContent =

  //#region PredictionContent

  //#region enums
  type TypeEnum = ContentEnum of string  
  //#endregion

  type PredictionContent = {
    Type : TypeEnum;
    Content : PredictionContentContent;
  }
  //#endregion
