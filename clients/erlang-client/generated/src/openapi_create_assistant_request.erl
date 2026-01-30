-module(openapi_create_assistant_request).

-export([encode/1]).

-export_type([openapi_create_assistant_request/0]).

-type openapi_create_assistant_request() ::
    #{ 'model' := openapi_create_assistant_request_model:openapi_create_assistant_request_model(),
       'name' => binary(),
       'description' => binary(),
       'instructions' => binary(),
       'tools' => list(),
       'tool_resources' => openapi_create_assistant_request_tool_resources:openapi_create_assistant_request_tool_resources(),
       'metadata' => maps:map(),
       'temperature' => integer(),
       'top_p' => integer(),
       'response_format' => openapi_assistants_api_response_format_option:openapi_assistants_api_response_format_option()
     }.

encode(#{ 'model' := Model,
          'name' := Name,
          'description' := Description,
          'instructions' := Instructions,
          'tools' := Tools,
          'tool_resources' := ToolResources,
          'metadata' := Metadata,
          'temperature' := Temperature,
          'top_p' := TopP,
          'response_format' := ResponseFormat
        }) ->
    #{ 'model' => Model,
       'name' => Name,
       'description' => Description,
       'instructions' => Instructions,
       'tools' => Tools,
       'tool_resources' => ToolResources,
       'metadata' => Metadata,
       'temperature' => Temperature,
       'top_p' => TopP,
       'response_format' => ResponseFormat
     }.
