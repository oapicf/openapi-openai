-module(openapi_run_stream_event_one_of_6).

-export([encode/1]).

-export_type([openapi_run_stream_event_one_of_6/0]).

-type openapi_run_stream_event_one_of_6() ::
    #{ 'event' := binary(),
       'data' := openapi_run_object:openapi_run_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
