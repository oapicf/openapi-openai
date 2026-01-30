-module(openapi_response_format_json_schema_json_schema).

-export([encode/1]).

-export_type([openapi_response_format_json_schema_json_schema/0]).

-type openapi_response_format_json_schema_json_schema() ::
    #{ 'description' => binary(),
       'name' := binary(),
       'schema' => maps:map(),
       'strict' => boolean()
     }.

encode(#{ 'description' := Description,
          'name' := Name,
          'schema' := Schema,
          'strict' := Strict
        }) ->
    #{ 'description' => Description,
       'name' => Name,
       'schema' => Schema,
       'strict' => Strict
     }.
