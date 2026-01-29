namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerWandb

module CreateFineTuningJobRequestIntegrationsInner =

  //#region CreateFineTuningJobRequestIntegrationsInner

  [<CLIMutable>]
  type CreateFineTuningJobRequestIntegrationsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "wandb")>]
    Wandb : CreateFineTuningJobRequestIntegrationsInnerWandb;
  }

  //#endregion
