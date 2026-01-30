-module(openapi_realtime_server_event_input_audio_buffer_speech_stopped).

-export([encode/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_speech_stopped/0]).

-type openapi_realtime_server_event_input_audio_buffer_speech_stopped() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'audio_end_ms' := integer(),
       'item_id' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'audio_end_ms' := AudioEndMs,
          'item_id' := ItemId
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'audio_end_ms' => AudioEndMs,
       'item_id' => ItemId
     }.
