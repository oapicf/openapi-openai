namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CostsResultAmount
open OpenAPI.Model.string option

module CostsResult =

  //#region CostsResult

  //#region enums
  type ObjectEnum = OrganizationCostsResultEnum of string  
  //#endregion

  type CostsResult = {
    Object : ObjectEnum;
    Amount : CostsResultAmount;
    LineItem : string option;
    ProjectId : string option;
  }
  //#endregion
