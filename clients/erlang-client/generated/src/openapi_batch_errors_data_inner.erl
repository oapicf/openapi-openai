-module(openapi_batch_errors_data_inner).

-export([encode/1]).

-export_type([openapi_batch_errors_data_inner/0]).

-type openapi_batch_errors_data_inner() ::
    #{ 'code' => binary(),
       'message' => binary(),
       'param' => binary(),
       'line' => integer()
     }.

encode(#{ 'code' := Code,
          'message' := Message,
          'param' := Param,
          'line' := Line
        }) ->
    #{ 'code' => Code,
       'message' => Message,
       'param' => Param,
       'line' => Line
     }.
