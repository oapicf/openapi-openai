-module(openapi_assistant_stream_event).

-export([encode/1]).

-export_type([openapi_assistant_stream_event/0]).

-type openapi_assistant_stream_event() ::
    #{ 'event' := binary(),
       'data' := binary()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
