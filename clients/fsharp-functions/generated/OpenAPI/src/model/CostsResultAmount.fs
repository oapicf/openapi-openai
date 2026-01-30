namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CostsResultAmount =

  //#region CostsResultAmount

  [<CLIMutable>]
  type CostsResultAmount = {
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : string;
  }

  //#endregion
