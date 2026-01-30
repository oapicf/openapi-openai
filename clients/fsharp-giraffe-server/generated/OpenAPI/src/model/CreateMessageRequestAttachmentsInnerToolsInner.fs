namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantToolsCode
open OpenAPI.Model.AssistantToolsFileSearchTypeOnly

module CreateMessageRequestAttachmentsInnerToolsInner =

  //#region CreateMessageRequestAttachmentsInnerToolsInner

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  |  FileSearchEnum of string  
  //#endregion

  type CreateMessageRequest_attachments_inner_tools_inner = {
    Type : TypeEnum;
  }
  //#endregion
