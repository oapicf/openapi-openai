namespace OpenAPI.Model

open System
open System.Collections.Generic

module ChatCompletionRequestMessageContentPartText =

  //#region ChatCompletionRequestMessageContentPartText

  //#region enums
  type TypeEnum = TextEnum of string  
  //#endregion

  type ChatCompletionRequestMessageContentPartText = {
    Type : TypeEnum;
    Text : string;
  }
  //#endregion
