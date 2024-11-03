namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation

module RunStepDeltaStepDetailsMessageCreationObject =

  //#region RunStepDeltaStepDetailsMessageCreationObject

  [<CLIMutable>]
  type RunStepDeltaStepDetailsMessageCreationObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "message_creation")>]
    MessageCreation : RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
  }

  //#endregion
