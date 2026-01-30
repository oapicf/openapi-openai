namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateModerationRequestInputOneOfInnerOneOf1 =

  //#region CreateModerationRequestInputOneOfInnerOneOf1

  //#region enums
  type TypeEnum = TextEnum of string  
  //#endregion

  type CreateModerationRequest_input_oneOf_inner_oneOf_1 = {
    Type : TypeEnum;
    Text : string;
  }
  //#endregion
