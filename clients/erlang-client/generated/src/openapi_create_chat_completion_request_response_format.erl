-module(openapi_create_chat_completion_request_response_format).

-export([encode/1]).

-export_type([openapi_create_chat_completion_request_response_format/0]).

-type openapi_create_chat_completion_request_response_format() ::
    #{ 'type' := binary(),
       'json_schema' := openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema()
     }.

encode(#{ 'type' := Type,
          'json_schema' := JsonSchema
        }) ->
    #{ 'type' => Type,
       'json_schema' => JsonSchema
     }.
