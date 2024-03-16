-module(openapi_create_embedding_response).

-include("openapi.hrl").

-export([openapi_create_embedding_response/0]).

-export([openapi_create_embedding_response/1]).

-export_type([openapi_create_embedding_response/0]).

-type openapi_create_embedding_response() ::
  [ {'object', binary() }
  | {'model', binary() }
  | {'data', list(openapi_create_embedding_response_data_inner:openapi_create_embedding_response_data_inner()) }
  | {'usage', openapi_create_embedding_response_usage:openapi_create_embedding_response_usage() }
  ].


openapi_create_embedding_response() ->
    openapi_create_embedding_response([]).

openapi_create_embedding_response(Fields) ->
  Default = [ {'object', binary() }
            , {'model', binary() }
            , {'data', list(openapi_create_embedding_response_data_inner:openapi_create_embedding_response_data_inner()) }
            , {'usage', openapi_create_embedding_response_usage:openapi_create_embedding_response_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

