namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFileCitationObject
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFilePathObject
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

module MessageDeltaContentTextObjectTextAnnotationsInner =

  //#region MessageDeltaContentTextObjectTextAnnotationsInner

  //#region enums
  type TypeEnum = FileCitationEnum of string  |  FilePathEnum of string  
  //#endregion

  type MessageDeltaContentTextObject_text_annotations_inner = {
    Index : int;
    Type : TypeEnum;
    Text : string;
    FileCitation : MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
    StartIndex : int;
    EndIndex : int;
    FilePath : MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
  }
  //#endregion
