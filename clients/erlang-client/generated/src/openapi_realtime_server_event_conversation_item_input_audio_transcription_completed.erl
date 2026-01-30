-module(openapi_realtime_server_event_conversation_item_input_audio_transcription_completed).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_item_input_audio_transcription_completed/0]).

-type openapi_realtime_server_event_conversation_item_input_audio_transcription_completed() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'item_id' := binary(),
       'content_index' := integer(),
       'transcript' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'item_id' := ItemId,
          'content_index' := ContentIndex,
          'transcript' := Transcript
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'item_id' => ItemId,
       'content_index' => ContentIndex,
       'transcript' => Transcript
     }.
