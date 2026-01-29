-module(openapi_create_assistant_file_request).

-export([encode/1]).

-export_type([openapi_create_assistant_file_request/0]).

-type openapi_create_assistant_file_request() ::
    #{ 'file_id' := binary()
     }.

encode(#{ 'file_id' := FileId
        }) ->
    #{ 'file_id' => FileId
     }.
