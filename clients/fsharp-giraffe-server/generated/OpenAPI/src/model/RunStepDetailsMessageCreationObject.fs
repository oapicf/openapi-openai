namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsMessageCreationObjectMessageCreation

module RunStepDetailsMessageCreationObject =

  //#region RunStepDetailsMessageCreationObject

  //#region enums
  type TypeEnum = MessageCreationEnum of string  
  //#endregion

  type RunStepDetailsMessageCreationObject = {
    Type : TypeEnum;
    MessageCreation : RunStepDetailsMessageCreationObjectMessageCreation;
  }
  //#endregion
