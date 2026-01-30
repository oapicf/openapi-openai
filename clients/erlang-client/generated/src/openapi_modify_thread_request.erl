-module(openapi_modify_thread_request).

-export([encode/1]).

-export_type([openapi_modify_thread_request/0]).

-type openapi_modify_thread_request() ::
    #{ 'tool_resources' => openapi_modify_thread_request_tool_resources:openapi_modify_thread_request_tool_resources(),
       'metadata' => maps:map()
     }.

encode(#{ 'tool_resources' := ToolResources,
          'metadata' := Metadata
        }) ->
    #{ 'tool_resources' => ToolResources,
       'metadata' => Metadata
     }.
