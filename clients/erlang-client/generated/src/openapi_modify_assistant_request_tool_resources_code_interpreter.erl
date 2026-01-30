-module(openapi_modify_assistant_request_tool_resources_code_interpreter).

-export([encode/1]).

-export_type([openapi_modify_assistant_request_tool_resources_code_interpreter/0]).

-type openapi_modify_assistant_request_tool_resources_code_interpreter() ::
    #{ 'file_ids' => list()
     }.

encode(#{ 'file_ids' := FileIds
        }) ->
    #{ 'file_ids' => FileIds
     }.
