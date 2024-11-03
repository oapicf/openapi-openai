-module(openapi_run_stream_event_one_of_6).

-include("openapi.hrl").

-export([openapi_run_stream_event_one_of_6/0]).

-export([openapi_run_stream_event_one_of_6/1]).

-export_type([openapi_run_stream_event_one_of_6/0]).

-type openapi_run_stream_event_one_of_6() ::
  [ {'event', binary() }
  | {'data', openapi_run_object:openapi_run_object() }
  ].


openapi_run_stream_event_one_of_6() ->
    openapi_run_stream_event_one_of_6([]).

openapi_run_stream_event_one_of_6(Fields) ->
  Default = [ {'event', elements([<<"thread.run.cancelling">>]) }
            , {'data', openapi_run_object:openapi_run_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

