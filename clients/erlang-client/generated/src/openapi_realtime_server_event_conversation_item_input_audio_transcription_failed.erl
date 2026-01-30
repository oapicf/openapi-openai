-module(openapi_realtime_server_event_conversation_item_input_audio_transcription_failed).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed/0]).

-type openapi_realtime_server_event_conversation_item_input_audio_transcription_failed() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'item_id' := binary(),
       'content_index' := integer(),
       'error' := openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error:openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'item_id' := ItemId,
          'content_index' := ContentIndex,
          'error' := Error
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'item_id' => ItemId,
       'content_index' => ContentIndex,
       'error' => Error
     }.
