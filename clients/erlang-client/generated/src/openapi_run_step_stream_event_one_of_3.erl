-module(openapi_run_step_stream_event_one_of_3).

-export([encode/1]).

-export_type([openapi_run_step_stream_event_one_of_3/0]).

-type openapi_run_step_stream_event_one_of_3() ::
    #{ 'event' := binary(),
       'data' := openapi_run_step_object:openapi_run_step_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
