namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MessageObject

module ListMessagesResponse =

  //#region ListMessagesResponse


  type ListMessagesResponse = {
    Object : string;
    Data : MessageObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
