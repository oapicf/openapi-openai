-module(openapi_run_step_stream_event_one_of_1).

-include("openapi.hrl").

-export([openapi_run_step_stream_event_one_of_1/0]).

-export([openapi_run_step_stream_event_one_of_1/1]).

-export_type([openapi_run_step_stream_event_one_of_1/0]).

-type openapi_run_step_stream_event_one_of_1() ::
  [ {'event', binary() }
  | {'data', openapi_run_step_object:openapi_run_step_object() }
  ].


openapi_run_step_stream_event_one_of_1() ->
    openapi_run_step_stream_event_one_of_1([]).

openapi_run_step_stream_event_one_of_1(Fields) ->
  Default = [ {'event', elements([<<"thread.run.step.in_progress">>]) }
            , {'data', openapi_run_step_object:openapi_run_step_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

