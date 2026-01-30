-module(openapi_vector_store_file_object).

-include("openapi.hrl").

-export([openapi_vector_store_file_object/0]).

-export([openapi_vector_store_file_object/1]).

-export_type([openapi_vector_store_file_object/0]).

-type openapi_vector_store_file_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'usage_bytes', integer() }
  | {'created_at', integer() }
  | {'vector_store_id', binary() }
  | {'status', binary() }
  | {'last_error', openapi_vector_store_file_object_last_error:openapi_vector_store_file_object_last_error() }
  | {'chunking_strategy', openapi_vector_store_file_object_chunking_strategy:openapi_vector_store_file_object_chunking_strategy() }
  ].


openapi_vector_store_file_object() ->
    openapi_vector_store_file_object([]).

openapi_vector_store_file_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"vector_store.file">>]) }
            , {'usage_bytes', integer() }
            , {'created_at', integer() }
            , {'vector_store_id', binary() }
            , {'status', elements([<<"in_progress">>, <<"completed">>, <<"cancelled">>, <<"failed">>]) }
            , {'last_error', openapi_vector_store_file_object_last_error:openapi_vector_store_file_object_last_error() }
            , {'chunking_strategy', openapi_vector_store_file_object_chunking_strategy:openapi_vector_store_file_object_chunking_strategy() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

