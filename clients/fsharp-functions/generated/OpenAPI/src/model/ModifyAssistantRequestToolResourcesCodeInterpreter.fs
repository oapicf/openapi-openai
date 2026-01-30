namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ModifyAssistantRequestToolResourcesCodeInterpreter =

  //#region ModifyAssistantRequestToolResourcesCodeInterpreter

  [<CLIMutable>]
  type ModifyAssistantRequestToolResourcesCodeInterpreter = {
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
  }

  //#endregion
