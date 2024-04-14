-module(openapi_run_step_stream_event_one_of_2).

-include("openapi.hrl").

-export([openapi_run_step_stream_event_one_of_2/0]).

-export([openapi_run_step_stream_event_one_of_2/1]).

-export_type([openapi_run_step_stream_event_one_of_2/0]).

-type openapi_run_step_stream_event_one_of_2() ::
  [ {'event', binary() }
  | {'data', openapi_run_step_delta_object:openapi_run_step_delta_object() }
  ].


openapi_run_step_stream_event_one_of_2() ->
    openapi_run_step_stream_event_one_of_2([]).

openapi_run_step_stream_event_one_of_2(Fields) ->
  Default = [ {'event', elements([<<"thread.run.step.delta">>]) }
            , {'data', openapi_run_step_delta_object:openapi_run_step_delta_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

