-module(openapi_create_embedding_request).

-include("openapi.hrl").

-export([openapi_create_embedding_request/0]).

-export([openapi_create_embedding_request/1]).

-export_type([openapi_create_embedding_request/0]).

-type openapi_create_embedding_request() ::
  [ {'input', openapi_create_embedding_request_input:openapi_create_embedding_request_input() }
  | {'model', openapi_create_embedding_request_model:openapi_create_embedding_request_model() }
  | {'encoding_format', binary() }
  | {'dimensions', integer() }
  | {'user', binary() }
  ].


openapi_create_embedding_request() ->
    openapi_create_embedding_request([]).

openapi_create_embedding_request(Fields) ->
  Default = [ {'input', openapi_create_embedding_request_input:openapi_create_embedding_request_input() }
            , {'model', openapi_create_embedding_request_model:openapi_create_embedding_request_model() }
            , {'encoding_format', elements([<<"float">>, <<"base64">>]) }
            , {'dimensions', integer(1) }
            , {'user', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

