namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RunStepDetailsMessageCreationObjectMessageCreation =

  //#region RunStepDetailsMessageCreationObjectMessageCreation

  [<CLIMutable>]
  type RunStepDetailsMessageCreationObjectMessageCreation = {
    [<JsonProperty(PropertyName = "message_id")>]
    MessageId : string;
  }

  //#endregion
