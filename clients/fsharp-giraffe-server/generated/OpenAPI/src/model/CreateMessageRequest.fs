namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateMessageRequestAttachmentsInner
open OpenAPI.Model.CreateMessageRequestContent

module CreateMessageRequest =

  //#region CreateMessageRequest

  //#region enums
  type RoleEnum = UserEnum of string  |  AssistantEnum of string  
  //#endregion

  type CreateMessageRequest = {
    Role : RoleEnum;
    Content : CreateMessageRequestContent;
    Attachments : CreateMessageRequestAttachmentsInner[];
    Metadata : obj;
  }
  //#endregion
