-module(openapi_error).

-include("openapi.hrl").

-export([openapi_error/0]).

-export([openapi_error/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
  [ {'code', binary() }
  | {'message', binary() }
  | {'param', binary() }
  | {'type', binary() }
  ].


openapi_error() ->
    openapi_error([]).

openapi_error(Fields) ->
  Default = [ {'code', binary() }
            , {'message', binary() }
            , {'param', binary() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

