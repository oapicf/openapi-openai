-module(openapi_assistant_object).

-export([encode/1]).

-export_type([openapi_assistant_object/0]).

-type openapi_assistant_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'name' := binary(),
       'description' := binary(),
       'model' := binary(),
       'instructions' := binary(),
       'tools' := list(),
       'tool_resources' => openapi_assistant_object_tool_resources:openapi_assistant_object_tool_resources(),
       'metadata' := maps:map(),
       'temperature' => integer(),
       'top_p' => integer(),
       'response_format' => openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'name' := Name,
          'description' := Description,
          'model' := Model,
          'instructions' := Instructions,
          'tools' := Tools,
          'tool_resources' := ToolResources,
          'metadata' := Metadata,
          'temperature' := Temperature,
          'top_p' := TopP,
          'response_format' := ResponseFormat
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'name' => Name,
       'description' => Description,
       'model' => Model,
       'instructions' => Instructions,
       'tools' => Tools,
       'tool_resources' => ToolResources,
       'metadata' => Metadata,
       'temperature' => Temperature,
       'top_p' => TopP,
       'response_format' => ResponseFormat
     }.
