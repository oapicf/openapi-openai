namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImageImageUrl

module ChatCompletionRequestMessageContentPartImage =

  //#region ChatCompletionRequestMessageContentPartImage

  //#region enums
  type TypeEnum = ImageUrlEnum of string  
  //#endregion

  type ChatCompletionRequestMessageContentPartImage = {
    Type : TypeEnum;
    ImageUrl : ChatCompletionRequestMessageContentPartImageImageUrl;
  }
  //#endregion
