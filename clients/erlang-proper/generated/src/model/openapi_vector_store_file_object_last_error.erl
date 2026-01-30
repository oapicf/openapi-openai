-module(openapi_vector_store_file_object_last_error).

-include("openapi.hrl").

-export([openapi_vector_store_file_object_last_error/0]).

-export([openapi_vector_store_file_object_last_error/1]).

-export_type([openapi_vector_store_file_object_last_error/0]).

-type openapi_vector_store_file_object_last_error() ::
  [ {'code', binary() }
  | {'message', binary() }
  ].


openapi_vector_store_file_object_last_error() ->
    openapi_vector_store_file_object_last_error([]).

openapi_vector_store_file_object_last_error(Fields) ->
  Default = [ {'code', elements([<<"server_error">>, <<"unsupported_file">>, <<"invalid_file">>]) }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

