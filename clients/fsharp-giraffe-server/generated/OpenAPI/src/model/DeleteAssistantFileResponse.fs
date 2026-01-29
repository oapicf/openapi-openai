namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeleteAssistantFileResponse =

  //#region DeleteAssistantFileResponse

  //#region enums
  type ObjectEnum = AssistantFileDeletedEnum of string  
  //#endregion

  type DeleteAssistantFileResponse = {
    Id : string;
    Deleted : bool;
    Object : ObjectEnum;
  }
  //#endregion
