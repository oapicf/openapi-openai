-module(openapi_update_vector_store_request).

-include("openapi.hrl").

-export([openapi_update_vector_store_request/0]).

-export([openapi_update_vector_store_request/1]).

-export_type([openapi_update_vector_store_request/0]).

-type openapi_update_vector_store_request() ::
  [ {'name', binary() }
  | {'expires_after', openapi_vector_store_expiration_after:openapi_vector_store_expiration_after() }
  | {'metadata', map() }
  ].


openapi_update_vector_store_request() ->
    openapi_update_vector_store_request([]).

openapi_update_vector_store_request(Fields) ->
  Default = [ {'name', binary() }
            , {'expires_after', openapi_vector_store_expiration_after:openapi_vector_store_expiration_after() }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

