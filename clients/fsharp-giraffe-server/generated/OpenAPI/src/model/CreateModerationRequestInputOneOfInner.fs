namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOf
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOf1
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOfImageUrl

module CreateModerationRequestInputOneOfInner =

  //#region CreateModerationRequestInputOneOfInner

  //#region enums
  type TypeEnum = ImageUrlEnum of string  |  TextEnum of string  
  //#endregion

  type CreateModerationRequest_input_oneOf_inner = {
    Type : TypeEnum;
    ImageUrl : CreateModerationRequestInputOneOfInnerOneOfImageUrl;
    Text : string;
  }
  //#endregion
