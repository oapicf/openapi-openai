namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteAssistantFileResponse =

  //#region DeleteAssistantFileResponse

  [<CLIMutable>]
  type DeleteAssistantFileResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
  }

  //#endregion
