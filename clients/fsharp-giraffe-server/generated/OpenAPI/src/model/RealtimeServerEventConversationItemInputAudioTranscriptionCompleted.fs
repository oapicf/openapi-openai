namespace OpenAPI.Model

open System
open System.Collections.Generic

module RealtimeServerEventConversationItemInputAudioTranscriptionCompleted =

  //#region RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

  //#region enums
  type TypeEnum = ConversationItemInputAudioTranscriptionCompletedEnum of string  
  //#endregion

  type RealtimeServerEventConversationItemInputAudioTranscriptionCompleted = {
    EventId : string;
    Type : TypeEnum;
    ItemId : string;
    ContentIndex : int;
    Transcript : string;
  }
  //#endregion
