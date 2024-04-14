namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunObjectLastError =

  //#region RunObjectLastError

  //#region enums
  type CodeEnum = ServerErrorEnum of string  |  RateLimitExceededEnum of string  |  InvalidPromptEnum of string  
  //#endregion

  type RunObject_last_error = {
    Code : CodeEnum;
    Message : string;
  }
  //#endregion
