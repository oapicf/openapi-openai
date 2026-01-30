-module(openapi_assistant_object_tool_resources_code_interpreter).

-export([encode/1]).

-export_type([openapi_assistant_object_tool_resources_code_interpreter/0]).

-type openapi_assistant_object_tool_resources_code_interpreter() ::
    #{ 'file_ids' => list()
     }.

encode(#{ 'file_ids' := FileIds
        }) ->
    #{ 'file_ids' => FileIds
     }.
