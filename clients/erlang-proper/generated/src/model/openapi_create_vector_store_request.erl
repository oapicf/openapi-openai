-module(openapi_create_vector_store_request).

-include("openapi.hrl").

-export([openapi_create_vector_store_request/0]).

-export([openapi_create_vector_store_request/1]).

-export_type([openapi_create_vector_store_request/0]).

-type openapi_create_vector_store_request() ::
  [ {'file_ids', list(binary()) }
  | {'name', binary() }
  | {'expires_after', openapi_vector_store_expiration_after:openapi_vector_store_expiration_after() }
  | {'chunking_strategy', openapi_create_vector_store_request_chunking_strategy:openapi_create_vector_store_request_chunking_strategy() }
  | {'metadata', map() }
  ].


openapi_create_vector_store_request() ->
    openapi_create_vector_store_request([]).

openapi_create_vector_store_request(Fields) ->
  Default = [ {'file_ids', list(binary()) }
            , {'name', binary() }
            , {'expires_after', openapi_vector_store_expiration_after:openapi_vector_store_expiration_after() }
            , {'chunking_strategy', openapi_create_vector_store_request_chunking_strategy:openapi_create_vector_store_request_chunking_strategy() }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

