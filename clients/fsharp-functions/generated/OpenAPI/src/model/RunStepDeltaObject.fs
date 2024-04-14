namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaObjectDelta

module RunStepDeltaObject =

  //#region RunStepDeltaObject

  [<CLIMutable>]
  type RunStepDeltaObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "delta")>]
    Delta : RunStepDeltaObjectDelta;
  }

  //#endregion
