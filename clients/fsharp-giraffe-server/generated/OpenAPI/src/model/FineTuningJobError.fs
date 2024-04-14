namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module FineTuningJobError =

  //#region FineTuningJobError


  type FineTuningJob_error = {
    Code : string;
    Message : string;
    Param : string option;
  }
  //#endregion
