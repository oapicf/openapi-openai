namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunStepDetailsMessageCreationObjectMessageCreation

module RunStepDetailsMessageCreationObject =

  //#region RunStepDetailsMessageCreationObject

  [<CLIMutable>]
  type RunStepDetailsMessageCreationObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "message_creation")>]
    MessageCreation : RunStepDetailsMessageCreationObjectMessageCreation;
  }

  //#endregion
