-module(openapi_realtime_client_event_input_audio_buffer_commit).

-export([encode/1]).

-export_type([openapi_realtime_client_event_input_audio_buffer_commit/0]).

-type openapi_realtime_client_event_input_audio_buffer_commit() ::
    #{ 'event_id' => binary(),
       'type' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type
     }.
