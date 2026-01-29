-module(openapi_done_event).

-include("openapi.hrl").

-export([openapi_done_event/0]).

-export([openapi_done_event/1]).

-export_type([openapi_done_event/0]).

-type openapi_done_event() ::
  [ {'event', binary() }
  | {'data', binary() }
  ].


openapi_done_event() ->
    openapi_done_event([]).

openapi_done_event(Fields) ->
  Default = [ {'event', elements([<<"done">>]) }
            , {'data', elements([<<"[DONE]">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

