namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerWandb

module FineTuningIntegration =

  //#region FineTuningIntegration

  [<CLIMutable>]
  type FineTuningIntegration = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "wandb")>]
    Wandb : CreateFineTuningJobRequestIntegrationsInnerWandb;
  }

  //#endregion
