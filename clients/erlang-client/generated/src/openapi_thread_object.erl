-module(openapi_thread_object).

-export([encode/1]).

-export_type([openapi_thread_object/0]).

-type openapi_thread_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'tool_resources' := openapi_modify_thread_request_tool_resources:openapi_modify_thread_request_tool_resources(),
       'metadata' := maps:map()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'tool_resources' := ToolResources,
          'metadata' := Metadata
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'tool_resources' => ToolResources,
       'metadata' => Metadata
     }.
