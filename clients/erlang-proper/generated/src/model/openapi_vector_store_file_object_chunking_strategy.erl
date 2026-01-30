-module(openapi_vector_store_file_object_chunking_strategy).

-include("openapi.hrl").

-export([openapi_vector_store_file_object_chunking_strategy/0]).

-export([openapi_vector_store_file_object_chunking_strategy/1]).

-export_type([openapi_vector_store_file_object_chunking_strategy/0]).

-type openapi_vector_store_file_object_chunking_strategy() ::
  [ {'type', binary() }
  | {'static', openapi_static_chunking_strategy:openapi_static_chunking_strategy() }
  ].


openapi_vector_store_file_object_chunking_strategy() ->
    openapi_vector_store_file_object_chunking_strategy([]).

openapi_vector_store_file_object_chunking_strategy(Fields) ->
  Default = [ {'type', elements([<<"static">>, <<"other">>]) }
            , {'static', openapi_static_chunking_strategy:openapi_static_chunking_strategy() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

