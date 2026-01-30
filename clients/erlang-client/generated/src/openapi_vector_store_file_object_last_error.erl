-module(openapi_vector_store_file_object_last_error).

-export([encode/1]).

-export_type([openapi_vector_store_file_object_last_error/0]).

-type openapi_vector_store_file_object_last_error() ::
    #{ 'code' := binary(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
