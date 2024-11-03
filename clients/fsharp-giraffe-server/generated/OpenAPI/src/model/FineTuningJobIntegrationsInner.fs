namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerWandb
open OpenAPI.Model.FineTuningIntegration

module FineTuningJobIntegrationsInner =

  //#region FineTuningJobIntegrationsInner

  //#region enums
  type TypeEnum = WandbEnum of string  
  //#endregion

  type FineTuningJob_integrations_inner = {
    Type : TypeEnum;
    Wandb : CreateFineTuningJobRequestIntegrationsInnerWandb;
  }
  //#endregion
