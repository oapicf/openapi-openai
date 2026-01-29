namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module CreateFineTuningJobRequestIntegrationsInnerWandb =

  //#region CreateFineTuningJobRequestIntegrationsInnerWandb


  type CreateFineTuningJobRequest_integrations_inner_wandb = {
    Project : string;
    Name : string option;
    Entity : string option;
    Tags : string[];
  }
  //#endregion
