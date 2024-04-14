-module(openapi_error).

-export([encode/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
    #{ 'code' := binary(),
       'message' := binary(),
       'param' := binary(),
       'type' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message,
          'param' := Param,
          'type' := Type
        }) ->
    #{ 'code' => Code,
       'message' => Message,
       'param' => Param,
       'type' => Type
     }.
