-module(openapi_run_stream_event_one_of_7).

-include("openapi.hrl").

-export([openapi_run_stream_event_one_of_7/0]).

-export([openapi_run_stream_event_one_of_7/1]).

-export_type([openapi_run_stream_event_one_of_7/0]).

-type openapi_run_stream_event_one_of_7() ::
  [ {'event', binary() }
  | {'data', openapi_run_object:openapi_run_object() }
  ].


openapi_run_stream_event_one_of_7() ->
    openapi_run_stream_event_one_of_7([]).

openapi_run_stream_event_one_of_7(Fields) ->
  Default = [ {'event', elements([<<"thread.run.cancelled">>]) }
            , {'data', openapi_run_object:openapi_run_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

