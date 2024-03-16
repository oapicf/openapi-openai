-module(openapi_chat_completion_functions).

-export([encode/1]).

-export_type([openapi_chat_completion_functions/0]).

-type openapi_chat_completion_functions() ::
    #{ 'name' := binary(),
       'description' => binary(),
       'parameters' => maps:map()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'parameters' := Parameters
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'parameters' => Parameters
     }.
