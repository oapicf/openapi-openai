namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CostsResultAmount
open OpenAPI.Model.string option

module CostsResult =

  //#region CostsResult

  [<CLIMutable>]
  type CostsResult = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "amount")>]
    Amount : CostsResultAmount;
    [<JsonProperty(PropertyName = "line_item")>]
    LineItem : string option;
    [<JsonProperty(PropertyName = "project_id")>]
    ProjectId : string option;
  }

  //#endregion
