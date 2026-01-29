-module(openapi_message_delta_object).

-export([encode/1]).

-export_type([openapi_message_delta_object/0]).

-type openapi_message_delta_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'delta' := openapi_message_delta_object_delta:openapi_message_delta_object_delta()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'delta' := Delta
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'delta' => Delta
     }.
