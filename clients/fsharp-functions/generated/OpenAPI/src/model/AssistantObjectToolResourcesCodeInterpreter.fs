namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssistantObjectToolResourcesCodeInterpreter =

  //#region AssistantObjectToolResourcesCodeInterpreter

  [<CLIMutable>]
  type AssistantObjectToolResourcesCodeInterpreter = {
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
  }

  //#endregion
