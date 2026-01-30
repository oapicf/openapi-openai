-module(openapi_batch_request_input).

-export([encode/1]).

-export_type([openapi_batch_request_input/0]).

-type openapi_batch_request_input() ::
    #{ 'custom_id' => binary(),
       'method' => binary(),
       'url' => binary()
     }.

encode(#{ 'custom_id' := CustomId,
          'method' := Method,
          'url' := Url
        }) ->
    #{ 'custom_id' => CustomId,
       'method' => Method,
       'url' => Url
     }.
