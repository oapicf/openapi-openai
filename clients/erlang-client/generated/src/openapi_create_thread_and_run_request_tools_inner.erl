-module(openapi_create_thread_and_run_request_tools_inner).

-export([encode/1]).

-export_type([openapi_create_thread_and_run_request_tools_inner/0]).

-type openapi_create_thread_and_run_request_tools_inner() ::
    #{ 'type' := binary(),
       'file_search' => openapi_assistant_tools_file_search_file_search:openapi_assistant_tools_file_search_file_search(),
       'function' := openapi_function_object:openapi_function_object()
     }.

encode(#{ 'type' := Type,
          'file_search' := FileSearch,
          'function' := Function
        }) ->
    #{ 'type' => Type,
       'file_search' => FileSearch,
       'function' => Function
     }.
