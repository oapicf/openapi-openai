namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

module MessageDeltaContentTextAnnotationsFileCitationObject =

  //#region MessageDeltaContentTextAnnotationsFileCitationObject

  //#region enums
  type TypeEnum = FileCitationEnum of string  
  //#endregion

  type MessageDeltaContentTextAnnotationsFileCitationObject = {
    Index : int;
    Type : TypeEnum;
    Text : string;
    FileCitation : MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
    StartIndex : int;
    EndIndex : int;
  }
  //#endregion
