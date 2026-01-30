-module(openapi_realtime_server_event_input_audio_buffer_cleared).

-export([encode/1]).

-export_type([openapi_realtime_server_event_input_audio_buffer_cleared/0]).

-type openapi_realtime_server_event_input_audio_buffer_cleared() ::
    #{ 'event_id' := binary(),
       'type' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type
     }.
