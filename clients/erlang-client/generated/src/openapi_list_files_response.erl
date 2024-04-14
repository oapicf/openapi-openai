-module(openapi_list_files_response).

-export([encode/1]).

-export_type([openapi_list_files_response/0]).

-type openapi_list_files_response() ::
    #{ 'data' := list(),
       'object' := binary()
     }.

encode(#{ 'data' := Data,
          'object' := Object
        }) ->
    #{ 'data' => Data,
       'object' => Object
     }.
