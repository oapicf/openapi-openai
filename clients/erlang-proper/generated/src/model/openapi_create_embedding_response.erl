-module(openapi_create_embedding_response).

-include("openapi.hrl").

-export([openapi_create_embedding_response/0]).

-export([openapi_create_embedding_response/1]).

-export_type([openapi_create_embedding_response/0]).

-type openapi_create_embedding_response() ::
  [ {'data', list(openapi_embedding:openapi_embedding()) }
  | {'model', binary() }
  | {'object', binary() }
  | {'usage', openapi_create_embedding_response_usage:openapi_create_embedding_response_usage() }
  ].


openapi_create_embedding_response() ->
    openapi_create_embedding_response([]).

openapi_create_embedding_response(Fields) ->
  Default = [ {'data', list(openapi_embedding:openapi_embedding()) }
            , {'model', binary() }
            , {'object', elements([<<"list">>]) }
            , {'usage', openapi_create_embedding_response_usage:openapi_create_embedding_response_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

