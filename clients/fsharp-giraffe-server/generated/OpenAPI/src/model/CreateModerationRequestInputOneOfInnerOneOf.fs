namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOfImageUrl

module CreateModerationRequestInputOneOfInnerOneOf =

  //#region CreateModerationRequestInputOneOfInnerOneOf

  //#region enums
  type TypeEnum = ImageUrlEnum of string  
  //#endregion

  type CreateModerationRequest_input_oneOf_inner_oneOf = {
    Type : TypeEnum;
    ImageUrl : CreateModerationRequestInputOneOfInnerOneOfImageUrl;
  }
  //#endregion
