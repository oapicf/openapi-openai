namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageContentTextAnnotationsFilePathObjectFilePath

module MessageContentTextAnnotationsFilePathObject =

  //#region MessageContentTextAnnotationsFilePathObject

  //#region enums
  type TypeEnum = FilePathEnum of string  
  //#endregion

  type MessageContentTextAnnotationsFilePathObject = {
    Type : TypeEnum;
    Text : string;
    FilePath : MessageContentTextAnnotationsFilePathObjectFilePath;
    StartIndex : int;
    EndIndex : int;
  }
  //#endregion
