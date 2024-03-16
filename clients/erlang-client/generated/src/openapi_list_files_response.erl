-module(openapi_list_files_response).

-export([encode/1]).

-export_type([openapi_list_files_response/0]).

-type openapi_list_files_response() ::
    #{ 'object' := binary(),
       'data' := list()
     }.

encode(#{ 'object' := Object,
          'data' := Data
        }) ->
    #{ 'object' => Object,
       'data' => Data
     }.
