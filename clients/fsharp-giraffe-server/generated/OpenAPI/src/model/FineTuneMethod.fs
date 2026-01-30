namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuneDPOMethod
open OpenAPI.Model.FineTuneSupervisedMethod

module FineTuneMethod =

  //#region FineTuneMethod

  //#region enums
  type TypeEnum = SupervisedEnum of string  |  DpoEnum of string  
  //#endregion

  type FineTuneMethod = {
    Type : TypeEnum;
    Supervised : FineTuneSupervisedMethod;
    Dpo : FineTuneDPOMethod;
  }
  //#endregion
