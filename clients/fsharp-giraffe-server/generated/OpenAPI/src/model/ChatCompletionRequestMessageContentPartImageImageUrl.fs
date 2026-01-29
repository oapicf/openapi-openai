namespace OpenAPI.Model

open System
open System.Collections.Generic

module ChatCompletionRequestMessageContentPartImageImageUrl =

  //#region ChatCompletionRequestMessageContentPartImageImageUrl

  //#region enums
  type DetailEnum = AutoEnum of string  |  LowEnum of string  |  HighEnum of string  
  //#endregion

  type ChatCompletionRequestMessageContentPartImage_image_url = {
    Url : string;
    Detail : DetailEnum;
  }
  //#endregion
