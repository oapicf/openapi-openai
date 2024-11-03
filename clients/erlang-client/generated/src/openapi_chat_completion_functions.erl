-module(openapi_chat_completion_functions).

-export([encode/1]).

-export_type([openapi_chat_completion_functions/0]).

-type openapi_chat_completion_functions() ::
    #{ 'description' => binary(),
       'name' := binary(),
       'parameters' => maps:map()
     }.

encode(#{ 'description' := Description,
          'name' := Name,
          'parameters' := Parameters
        }) ->
    #{ 'description' => Description,
       'name' => Name,
       'parameters' => Parameters
     }.
