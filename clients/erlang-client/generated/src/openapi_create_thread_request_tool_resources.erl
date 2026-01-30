-module(openapi_create_thread_request_tool_resources).

-export([encode/1]).

-export_type([openapi_create_thread_request_tool_resources/0]).

-type openapi_create_thread_request_tool_resources() ::
    #{ 'code_interpreter' => openapi_create_assistant_request_tool_resources_code_interpreter:openapi_create_assistant_request_tool_resources_code_interpreter(),
       'file_search' => openapi_create_thread_request_tool_resources_file_search:openapi_create_thread_request_tool_resources_file_search()
     }.

encode(#{ 'code_interpreter' := CodeInterpreter,
          'file_search' := FileSearch
        }) ->
    #{ 'code_interpreter' => CodeInterpreter,
       'file_search' => FileSearch
     }.
