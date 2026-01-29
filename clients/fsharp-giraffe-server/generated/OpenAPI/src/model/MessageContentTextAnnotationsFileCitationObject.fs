namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentTextAnnotationsFileCitationObjectFileCitation

module MessageContentTextAnnotationsFileCitationObject =

  //#region MessageContentTextAnnotationsFileCitationObject

  //#region enums
  type TypeEnum = FileCitationEnum of string  
  //#endregion

  type MessageContentTextAnnotationsFileCitationObject = {
    Type : TypeEnum;
    Text : string;
    FileCitation : MessageContentTextAnnotationsFileCitationObjectFileCitation;
    StartIndex : int;
    EndIndex : int;
  }
  //#endregion
