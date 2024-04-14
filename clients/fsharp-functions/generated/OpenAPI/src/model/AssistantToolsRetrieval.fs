namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssistantToolsRetrieval =

  //#region AssistantToolsRetrieval

  [<CLIMutable>]
  type AssistantToolsRetrieval = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
