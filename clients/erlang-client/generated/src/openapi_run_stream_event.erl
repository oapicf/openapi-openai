-module(openapi_run_stream_event).

-export([encode/1]).

-export_type([openapi_run_stream_event/0]).

-type openapi_run_stream_event() ::
    #{ 'event' := binary(),
       'data' := openapi_run_object:openapi_run_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
