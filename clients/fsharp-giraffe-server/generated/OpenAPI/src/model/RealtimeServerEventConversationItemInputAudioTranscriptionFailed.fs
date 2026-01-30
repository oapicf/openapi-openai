namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

module RealtimeServerEventConversationItemInputAudioTranscriptionFailed =

  //#region RealtimeServerEventConversationItemInputAudioTranscriptionFailed

  //#region enums
  type TypeEnum = ConversationItemInputAudioTranscriptionFailedEnum of string  
  //#endregion

  type RealtimeServerEventConversationItemInputAudioTranscriptionFailed = {
    EventId : string;
    Type : TypeEnum;
    ItemId : string;
    ContentIndex : int;
    Error : RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
  }
  //#endregion
