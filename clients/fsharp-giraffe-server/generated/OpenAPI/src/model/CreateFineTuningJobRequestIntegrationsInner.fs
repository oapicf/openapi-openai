namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerWandb

module CreateFineTuningJobRequestIntegrationsInner =

  //#region CreateFineTuningJobRequestIntegrationsInner

  //#region enums
  type TypeEnum = WandbEnum of string  
  //#endregion

  type CreateFineTuningJobRequest_integrations_inner = {
    Type : TypeEnum;
    Wandb : CreateFineTuningJobRequestIntegrationsInnerWandb;
  }
  //#endregion
