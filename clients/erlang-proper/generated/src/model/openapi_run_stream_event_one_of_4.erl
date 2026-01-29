-module(openapi_run_stream_event_one_of_4).

-include("openapi.hrl").

-export([openapi_run_stream_event_one_of_4/0]).

-export([openapi_run_stream_event_one_of_4/1]).

-export_type([openapi_run_stream_event_one_of_4/0]).

-type openapi_run_stream_event_one_of_4() ::
  [ {'event', binary() }
  | {'data', openapi_run_object:openapi_run_object() }
  ].


openapi_run_stream_event_one_of_4() ->
    openapi_run_stream_event_one_of_4([]).

openapi_run_stream_event_one_of_4(Fields) ->
  Default = [ {'event', elements([<<"thread.run.completed">>]) }
            , {'data', openapi_run_object:openapi_run_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

