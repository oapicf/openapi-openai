namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

module MessageDeltaContentTextAnnotationsFilePathObject =

  //#region MessageDeltaContentTextAnnotationsFilePathObject

  //#region enums
  type TypeEnum = FilePathEnum of string  
  //#endregion

  type MessageDeltaContentTextAnnotationsFilePathObject = {
    Index : int;
    Type : TypeEnum;
    Text : string;
    FilePath : MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
    StartIndex : int;
    EndIndex : int;
  }
  //#endregion
