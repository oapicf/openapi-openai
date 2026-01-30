-module(openapi_assistants_api_response_format_option).

-export([encode/1]).

-export_type([openapi_assistants_api_response_format_option/0]).

-type openapi_assistants_api_response_format_option() ::
    #{ 'type' := binary(),
       'json_schema' := openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema()
     }.

encode(#{ 'type' := Type,
          'json_schema' := JsonSchema
        }) ->
    #{ 'type' => Type,
       'json_schema' => JsonSchema
     }.
