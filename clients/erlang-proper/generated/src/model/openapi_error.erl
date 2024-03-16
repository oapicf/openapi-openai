-module(openapi_error).

-include("openapi.hrl").

-export([openapi_error/0]).

-export([openapi_error/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
  [ {'type', binary() }
  | {'message', binary() }
  | {'param', binary() }
  | {'code', binary() }
  ].


openapi_error() ->
    openapi_error([]).

openapi_error(Fields) ->
  Default = [ {'type', binary() }
            , {'message', binary() }
            , {'param', binary() }
            , {'code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

