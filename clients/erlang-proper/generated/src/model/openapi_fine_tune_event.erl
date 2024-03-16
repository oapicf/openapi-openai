-module(openapi_fine_tune_event).

-include("openapi.hrl").

-export([openapi_fine_tune_event/0]).

-export([openapi_fine_tune_event/1]).

-export_type([openapi_fine_tune_event/0]).

-type openapi_fine_tune_event() ::
  [ {'object', binary() }
  | {'created_at', integer() }
  | {'level', binary() }
  | {'message', binary() }
  ].


openapi_fine_tune_event() ->
    openapi_fine_tune_event([]).

openapi_fine_tune_event(Fields) ->
  Default = [ {'object', binary() }
            , {'created_at', integer() }
            , {'level', binary() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

