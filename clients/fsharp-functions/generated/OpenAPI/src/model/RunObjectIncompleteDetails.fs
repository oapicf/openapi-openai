namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunObjectIncompleteDetails =

  //#region RunObjectIncompleteDetails

  [<CLIMutable>]
  type RunObjectIncompleteDetails = {
    [<JsonProperty(PropertyName = "reason")>]
    Reason : string;
  }

  //#endregion
