-module(openapi_create_embedding_request).

-include("openapi.hrl").

-export([openapi_create_embedding_request/0]).

-export([openapi_create_embedding_request/1]).

-export_type([openapi_create_embedding_request/0]).

-type openapi_create_embedding_request() ::
  [ {'model', openapi_create_embedding_request_model:openapi_create_embedding_request_model() }
  | {'input', openapi_create_embedding_request_input:openapi_create_embedding_request_input() }
  | {'user', binary() }
  ].


openapi_create_embedding_request() ->
    openapi_create_embedding_request([]).

openapi_create_embedding_request(Fields) ->
  Default = [ {'model', openapi_create_embedding_request_model:openapi_create_embedding_request_model() }
            , {'input', openapi_create_embedding_request_input:openapi_create_embedding_request_input() }
            , {'user', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

