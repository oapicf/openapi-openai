-module(openapi_embedding).

-include("openapi.hrl").

-export([openapi_embedding/0]).

-export([openapi_embedding/1]).

-export_type([openapi_embedding/0]).

-type openapi_embedding() ::
  [ {'index', integer() }
  | {'embedding', list(integer()) }
  | {'object', binary() }
  ].


openapi_embedding() ->
    openapi_embedding([]).

openapi_embedding(Fields) ->
  Default = [ {'index', integer() }
            , {'embedding', list(integer()) }
            , {'object', elements([<<"embedding">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

