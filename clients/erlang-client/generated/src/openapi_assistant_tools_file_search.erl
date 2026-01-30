-module(openapi_assistant_tools_file_search).

-export([encode/1]).

-export_type([openapi_assistant_tools_file_search/0]).

-type openapi_assistant_tools_file_search() ::
    #{ 'type' := binary(),
       'file_search' => openapi_assistant_tools_file_search_file_search:openapi_assistant_tools_file_search_file_search()
     }.

encode(#{ 'type' := Type,
          'file_search' := FileSearch
        }) ->
    #{ 'type' => Type,
       'file_search' => FileSearch
     }.
