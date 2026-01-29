namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepObjectLastError =

  //#region RunStepObjectLastError

  //#region enums
  type CodeEnum = ServerErrorEnum of string  |  RateLimitExceededEnum of string  
  //#endregion

  type RunStepObject_last_error = {
    Code : CodeEnum;
    Message : string;
  }
  //#endregion
