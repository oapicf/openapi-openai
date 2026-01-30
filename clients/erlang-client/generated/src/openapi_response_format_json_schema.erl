-module(openapi_response_format_json_schema).

-export([encode/1]).

-export_type([openapi_response_format_json_schema/0]).

-type openapi_response_format_json_schema() ::
    #{ 'type' := binary(),
       'json_schema' := openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema()
     }.

encode(#{ 'type' := Type,
          'json_schema' := JsonSchema
        }) ->
    #{ 'type' => Type,
       'json_schema' => JsonSchema
     }.
