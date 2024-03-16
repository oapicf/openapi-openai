-module(openapi_error).

-export([encode/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
    #{ 'type' := binary(),
       'message' := binary(),
       'param' := binary(),
       'code' := binary()
     }.

encode(#{ 'type' := Type,
          'message' := Message,
          'param' := Param,
          'code' := Code
        }) ->
    #{ 'type' => Type,
       'message' => Message,
       'param' => Param,
       'code' => Code
     }.
