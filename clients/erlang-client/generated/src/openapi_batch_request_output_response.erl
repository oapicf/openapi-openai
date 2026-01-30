-module(openapi_batch_request_output_response).

-export([encode/1]).

-export_type([openapi_batch_request_output_response/0]).

-type openapi_batch_request_output_response() ::
    #{ 'status_code' => integer(),
       'request_id' => binary(),
       'body' => maps:map()
     }.

encode(#{ 'status_code' := StatusCode,
          'request_id' := RequestId,
          'body' := Body
        }) ->
    #{ 'status_code' => StatusCode,
       'request_id' => RequestId,
       'body' => Body
     }.
