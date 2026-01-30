-module(openapi_realtime_client_event_input_audio_buffer_clear).

-export([encode/1]).

-export_type([openapi_realtime_client_event_input_audio_buffer_clear/0]).

-type openapi_realtime_client_event_input_audio_buffer_clear() ::
    #{ 'event_id' => binary(),
       'type' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type
     }.
