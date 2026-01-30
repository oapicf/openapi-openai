-module(openapi_vector_store_object).

-include("openapi.hrl").

-export([openapi_vector_store_object/0]).

-export([openapi_vector_store_object/1]).

-export_type([openapi_vector_store_object/0]).

-type openapi_vector_store_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'name', binary() }
  | {'usage_bytes', integer() }
  | {'file_counts', openapi_vector_store_object_file_counts:openapi_vector_store_object_file_counts() }
  | {'status', binary() }
  | {'expires_after', openapi_vector_store_expiration_after:openapi_vector_store_expiration_after() }
  | {'expires_at', integer() }
  | {'last_active_at', integer() }
  | {'metadata', map() }
  ].


openapi_vector_store_object() ->
    openapi_vector_store_object([]).

openapi_vector_store_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"vector_store">>]) }
            , {'created_at', integer() }
            , {'name', binary() }
            , {'usage_bytes', integer() }
            , {'file_counts', openapi_vector_store_object_file_counts:openapi_vector_store_object_file_counts() }
            , {'status', elements([<<"expired">>, <<"in_progress">>, <<"completed">>]) }
            , {'expires_after', openapi_vector_store_expiration_after:openapi_vector_store_expiration_after() }
            , {'expires_at', integer() }
            , {'last_active_at', integer() }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

