-module(openapi_create_vector_store_file_request).

-include("openapi.hrl").

-export([openapi_create_vector_store_file_request/0]).

-export([openapi_create_vector_store_file_request/1]).

-export_type([openapi_create_vector_store_file_request/0]).

-type openapi_create_vector_store_file_request() ::
  [ {'file_id', binary() }
  | {'chunking_strategy', openapi_chunking_strategy_request_param:openapi_chunking_strategy_request_param() }
  ].


openapi_create_vector_store_file_request() ->
    openapi_create_vector_store_file_request([]).

openapi_create_vector_store_file_request(Fields) ->
  Default = [ {'file_id', binary() }
            , {'chunking_strategy', openapi_chunking_strategy_request_param:openapi_chunking_strategy_request_param() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

