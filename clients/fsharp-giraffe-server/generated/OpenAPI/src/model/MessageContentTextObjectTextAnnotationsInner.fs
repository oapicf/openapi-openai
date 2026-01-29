namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentTextAnnotationsFileCitationObject
open OpenAPI.Model.MessageContentTextAnnotationsFileCitationObjectFileCitation
open OpenAPI.Model.MessageContentTextAnnotationsFilePathObject
open OpenAPI.Model.MessageContentTextAnnotationsFilePathObjectFilePath

module MessageContentTextObjectTextAnnotationsInner =

  //#region MessageContentTextObjectTextAnnotationsInner

  //#region enums
  type TypeEnum = FileCitationEnum of string  |  FilePathEnum of string  
  //#endregion

  type MessageContentTextObject_text_annotations_inner = {
    Type : TypeEnum;
    Text : string;
    FileCitation : MessageContentTextAnnotationsFileCitationObjectFileCitation;
    StartIndex : int;
    EndIndex : int;
    FilePath : MessageContentTextAnnotationsFilePathObjectFilePath;
  }
  //#endregion
