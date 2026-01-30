-module(openapi_batch_request_output_error).

-export([encode/1]).

-export_type([openapi_batch_request_output_error/0]).

-type openapi_batch_request_output_error() ::
    #{ 'code' => binary(),
       'message' => binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
