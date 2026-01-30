namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeConversationItemContentInner =

  //#region RealtimeConversationItemContentInner

  //#region enums
  type TypeEnum = InputAudioEnum of string  |  InputTextEnum of string  |  ItemReferenceEnum of string  |  TextEnum of string  
  //#endregion

  type RealtimeConversationItem_content_inner = {
    Type : TypeEnum;
    Text : string;
    Id : string;
    Audio : string;
    Transcript : string;
  }
  //#endregion
