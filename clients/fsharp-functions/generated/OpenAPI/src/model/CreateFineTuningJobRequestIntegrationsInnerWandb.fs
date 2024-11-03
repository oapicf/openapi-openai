namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module CreateFineTuningJobRequestIntegrationsInnerWandb =

  //#region CreateFineTuningJobRequestIntegrationsInnerWandb

  [<CLIMutable>]
  type CreateFineTuningJobRequestIntegrationsInnerWandb = {
    [<JsonProperty(PropertyName = "project")>]
    Project : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "entity")>]
    Entity : string option;
    [<JsonProperty(PropertyName = "tags")>]
    Tags : string[];
  }

  //#endregion
