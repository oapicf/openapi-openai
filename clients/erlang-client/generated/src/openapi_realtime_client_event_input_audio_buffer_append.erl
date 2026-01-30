-module(openapi_realtime_client_event_input_audio_buffer_append).

-export([encode/1]).

-export_type([openapi_realtime_client_event_input_audio_buffer_append/0]).

-type openapi_realtime_client_event_input_audio_buffer_append() ::
    #{ 'event_id' => binary(),
       'type' := binary(),
       'audio' := binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'audio' := Audio
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'audio' => Audio
     }.
