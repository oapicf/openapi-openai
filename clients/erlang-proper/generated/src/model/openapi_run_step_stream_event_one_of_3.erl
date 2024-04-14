-module(openapi_run_step_stream_event_one_of_3).

-include("openapi.hrl").

-export([openapi_run_step_stream_event_one_of_3/0]).

-export([openapi_run_step_stream_event_one_of_3/1]).

-export_type([openapi_run_step_stream_event_one_of_3/0]).

-type openapi_run_step_stream_event_one_of_3() ::
  [ {'event', binary() }
  | {'data', openapi_run_step_object:openapi_run_step_object() }
  ].


openapi_run_step_stream_event_one_of_3() ->
    openapi_run_step_stream_event_one_of_3([]).

openapi_run_step_stream_event_one_of_3(Fields) ->
  Default = [ {'event', elements([<<"thread.run.step.completed">>]) }
            , {'data', openapi_run_step_object:openapi_run_step_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

