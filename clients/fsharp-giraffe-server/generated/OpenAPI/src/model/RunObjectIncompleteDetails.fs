namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunObjectIncompleteDetails =

  //#region RunObjectIncompleteDetails

  //#region enums
  type ReasonEnum = MaxCompletionTokensEnum of string  |  MaxPromptTokensEnum of string  
  //#endregion

  type RunObject_incomplete_details = {
    Reason : ReasonEnum;
  }
  //#endregion
