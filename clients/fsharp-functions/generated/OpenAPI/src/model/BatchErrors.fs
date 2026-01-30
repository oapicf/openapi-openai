namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BatchErrorsDataInner

module BatchErrors =

  //#region BatchErrors

  [<CLIMutable>]
  type BatchErrors = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : BatchErrorsDataInner[];
  }

  //#endregion
