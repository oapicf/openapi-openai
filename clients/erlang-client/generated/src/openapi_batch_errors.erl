-module(openapi_batch_errors).

-export([encode/1]).

-export_type([openapi_batch_errors/0]).

-type openapi_batch_errors() ::
    #{ 'object' => binary(),
       'data' => list()
     }.

encode(#{ 'object' := Object,
          'data' := Data
        }) ->
    #{ 'object' => Object,
       'data' => Data
     }.
