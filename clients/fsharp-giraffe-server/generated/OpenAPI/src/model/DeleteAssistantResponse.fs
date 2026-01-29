namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeleteAssistantResponse =

  //#region DeleteAssistantResponse

  //#region enums
  type ObjectEnum = AssistantDeletedEnum of string  
  //#endregion

  type DeleteAssistantResponse = {
    Id : string;
    Deleted : bool;
    Object : ObjectEnum;
  }
  //#endregion
