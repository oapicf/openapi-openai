namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateMessageRequest =

  //#region CreateMessageRequest

  //#region enums
  type RoleEnum = UserEnum of string  |  AssistantEnum of string  
  //#endregion

  type CreateMessageRequest = {
    Role : RoleEnum;
    Content : string;
    FileIds : string[];
    Metadata : obj;
  }
  //#endregion
