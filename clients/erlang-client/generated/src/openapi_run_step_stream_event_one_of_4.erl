-module(openapi_run_step_stream_event_one_of_4).

-export([encode/1]).

-export_type([openapi_run_step_stream_event_one_of_4/0]).

-type openapi_run_step_stream_event_one_of_4() ::
    #{ 'event' := binary(),
       'data' := openapi_run_step_object:openapi_run_step_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
