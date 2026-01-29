namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerWandb
open OpenAPI.Model.FineTuningIntegration

module FineTuningJobIntegrationsInner =

  //#region FineTuningJobIntegrationsInner

  [<CLIMutable>]
  type FineTuningJobIntegrationsInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "wandb")>]
    Wandb : CreateFineTuningJobRequestIntegrationsInnerWandb;
  }

  //#endregion
