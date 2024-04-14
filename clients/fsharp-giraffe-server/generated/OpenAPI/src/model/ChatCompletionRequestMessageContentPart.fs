namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImage
open OpenAPI.Model.ChatCompletionRequestMessageContentPartImageImageUrl
open OpenAPI.Model.ChatCompletionRequestMessageContentPartText

module ChatCompletionRequestMessageContentPart =

  //#region ChatCompletionRequestMessageContentPart

  //#region enums
  type TypeEnum = TextEnum of string  |  ImageUrlEnum of string  
  //#endregion

  type ChatCompletionRequestMessageContentPart = {
    Type : TypeEnum;
    Text : string;
    ImageUrl : ChatCompletionRequestMessageContentPartImageImageUrl;
  }
  //#endregion
