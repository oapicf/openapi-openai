namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerType
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInnerWandb

module CreateFineTuningJobRequestIntegrationsInner =

  //#region CreateFineTuningJobRequestIntegrationsInner


  type CreateFineTuningJobRequest_integrations_inner = {
    Type : CreateFineTuningJobRequestIntegrationsInnerType;
    Wandb : CreateFineTuningJobRequestIntegrationsInnerWandb;
  }
  //#endregion
