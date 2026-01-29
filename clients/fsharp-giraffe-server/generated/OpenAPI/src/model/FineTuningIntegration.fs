namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerWandb

module FineTuningIntegration =

  //#region FineTuningIntegration

  //#region enums
  type TypeEnum = WandbEnum of string  
  //#endregion

  type FineTuningIntegration = {
    Type : TypeEnum;
    Wandb : CreateFineTuningJobRequestIntegrationsInnerWandb;
  }
  //#endregion
