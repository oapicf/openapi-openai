namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeConversationItemContentInner

module RealtimeConversationItem =

  //#region RealtimeConversationItem

  //#region enums
  type TypeEnum = MessageEnum of string  |  FunctionCallEnum of string  |  FunctionCallOutputEnum of string  
  //#endregion
  //#region enums
  type ObjectEnum = RealtimeItemEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = CompletedEnum of string  |  IncompleteEnum of string  
  //#endregion
  //#region enums
  type RoleEnum = UserEnum of string  |  AssistantEnum of string  |  SystemEnum of string  
  //#endregion

  type RealtimeConversationItem = {
    Id : string;
    Type : TypeEnum;
    Object : ObjectEnum;
    Status : StatusEnum;
    Role : RoleEnum;
    Content : RealtimeConversationItemContentInner[];
    CallId : string;
    Name : string;
    Arguments : string;
    Output : string;
  }
  //#endregion
