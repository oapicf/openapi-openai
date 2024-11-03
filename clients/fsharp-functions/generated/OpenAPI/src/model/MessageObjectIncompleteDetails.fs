namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageObjectIncompleteDetails =

  //#region MessageObjectIncompleteDetails

  [<CLIMutable>]
  type MessageObjectIncompleteDetails = {
    [<JsonProperty(PropertyName = "reason")>]
    Reason : string;
  }

  //#endregion
