-module(openapi_create_embedding_response_data_inner).

-include("openapi.hrl").

-export([openapi_create_embedding_response_data_inner/0]).

-export([openapi_create_embedding_response_data_inner/1]).

-export_type([openapi_create_embedding_response_data_inner/0]).

-type openapi_create_embedding_response_data_inner() ::
  [ {'index', integer() }
  | {'object', binary() }
  | {'embedding', list(integer()) }
  ].


openapi_create_embedding_response_data_inner() ->
    openapi_create_embedding_response_data_inner([]).

openapi_create_embedding_response_data_inner(Fields) ->
  Default = [ {'index', integer() }
            , {'object', binary() }
            , {'embedding', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

