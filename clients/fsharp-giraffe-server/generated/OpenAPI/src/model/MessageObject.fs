namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageObjectContentInner
open OpenAPI.Model.MessageObjectIncompleteDetails
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module MessageObject =

  //#region MessageObject

  //#region enums
  type ObjectEnum = ThreadMessageEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = InProgressEnum of string  |  IncompleteEnum of string  |  CompletedEnum of string  
  //#endregion
  //#region enums
  type RoleEnum = UserEnum of string  |  AssistantEnum of string  
  //#endregion

  type MessageObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    ThreadId : string;
    Status : StatusEnum;
    IncompleteDetails : MessageObjectIncompleteDetails;
    CompletedAt : int option;
    IncompleteAt : int option;
    Role : RoleEnum;
    Content : MessageObjectContentInner[];
    AssistantId : string option;
    RunId : string option;
    FileIds : string[];
    Metadata : obj;
  }
  //#endregion
