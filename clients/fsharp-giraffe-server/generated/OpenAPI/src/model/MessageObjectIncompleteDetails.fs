namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageObjectIncompleteDetails =

  //#region MessageObjectIncompleteDetails

  //#region enums
  type ReasonEnum = ContentFilterEnum of string  |  MaxTokensEnum of string  |  RunCancelledEnum of string  |  RunExpiredEnum of string  |  RunFailedEnum of string  
  //#endregion

  type MessageObject_incomplete_details = {
    Reason : ReasonEnum;
  }
  //#endregion
