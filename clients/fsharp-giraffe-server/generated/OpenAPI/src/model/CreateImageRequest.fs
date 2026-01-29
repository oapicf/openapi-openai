namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateImageRequestModel
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateImageRequest =

  //#region CreateImageRequest

  //#region enums
  type QualityEnum = StandardEnum of string  |  HdEnum of string  
  //#endregion
  //#region enums
  type ResponseFormatEnum = UrlEnum of string option  |  B64JsonEnum of string option  
  //#endregion
  //#region enums
  type SizeEnum = _256x256Enum of string option  |  _512x512Enum of string option  |  _1024x1024Enum of string option  |  _1792x1024Enum of string option  |  _1024x1792Enum of string option  
  //#endregion
  //#region enums
  type StyleEnum = VividEnum of string option  |  NaturalEnum of string option  
  //#endregion

  type CreateImageRequest = {
    Prompt : string;
    Model : CreateImageRequestModel;
    N : int option;
    Quality : QualityEnum;
    ResponseFormat : ResponseFormatEnum;
    Size : SizeEnum;
    Style : StyleEnum;
    User : string;
  }
  //#endregion
