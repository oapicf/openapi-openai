namespace OpenAPI.Model

open System
open System.Collections.Generic

module ChatCompletionRequestMessageContentPartRefusal =

  //#region ChatCompletionRequestMessageContentPartRefusal

  //#region enums
  type TypeEnum = RefusalEnum of string  
  //#endregion

  type ChatCompletionRequestMessageContentPartRefusal = {
    Type : TypeEnum;
    Refusal : string;
  }
  //#endregion
