namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObjectRequiredActionSubmitToolOutputs

module RunObjectRequiredAction =

  //#region RunObjectRequiredAction

  //#region enums
  type TypeEnum = SubmitToolOutputsEnum of string  
  //#endregion

  type RunObject_required_action = {
    Type : TypeEnum;
    SubmitToolOutputs : RunObjectRequiredActionSubmitToolOutputs;
  }
  //#endregion
