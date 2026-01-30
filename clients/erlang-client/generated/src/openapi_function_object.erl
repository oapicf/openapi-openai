-module(openapi_function_object).

-export([encode/1]).

-export_type([openapi_function_object/0]).

-type openapi_function_object() ::
    #{ 'description' => binary(),
       'name' := binary(),
       'parameters' => maps:map(),
       'strict' => boolean()
     }.

encode(#{ 'description' := Description,
          'name' := Name,
          'parameters' := Parameters,
          'strict' := Strict
        }) ->
    #{ 'description' => Description,
       'name' => Name,
       'parameters' => Parameters,
       'strict' => Strict
     }.
