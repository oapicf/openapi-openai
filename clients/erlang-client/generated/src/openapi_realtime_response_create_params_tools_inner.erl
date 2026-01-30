-module(openapi_realtime_response_create_params_tools_inner).

-export([encode/1]).

-export_type([openapi_realtime_response_create_params_tools_inner/0]).

-type openapi_realtime_response_create_params_tools_inner() ::
    #{ 'type' => binary(),
       'name' => binary(),
       'description' => binary(),
       'parameters' => maps:map()
     }.

encode(#{ 'type' := Type,
          'name' := Name,
          'description' := Description,
          'parameters' := Parameters
        }) ->
    #{ 'type' => Type,
       'name' => Name,
       'description' => Description,
       'parameters' => Parameters
     }.
