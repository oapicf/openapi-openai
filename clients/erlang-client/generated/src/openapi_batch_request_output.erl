-module(openapi_batch_request_output).

-export([encode/1]).

-export_type([openapi_batch_request_output/0]).

-type openapi_batch_request_output() ::
    #{ 'id' => binary(),
       'custom_id' => binary(),
       'response' => openapi_batch_request_output_response:openapi_batch_request_output_response(),
       'error' => openapi_batch_request_output_error:openapi_batch_request_output_error()
     }.

encode(#{ 'id' := Id,
          'custom_id' := CustomId,
          'response' := Response,
          'error' := Error
        }) ->
    #{ 'id' => Id,
       'custom_id' => CustomId,
       'response' => Response,
       'error' => Error
     }.
