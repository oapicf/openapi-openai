-module(openapi_realtime_server_event_input_audio_buffer_speech_started).

-export([encode/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_speech_started/0]).

-type openapi_realtime_server_event_input_audio_buffer_speech_started() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'audio_start_ms' := integer(),
       'item_id' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'audio_start_ms' := AudioStartMs,
          'item_id' := ItemId
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'audio_start_ms' => AudioStartMs,
       'item_id' => ItemId
     }.
