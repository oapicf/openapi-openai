-module(openapi_error_response).

-export([encode/1]).

-export_type([openapi_error_response/0]).

-type openapi_error_response() ::
    #{ 'error' := openapi_error:openapi_error()
     }.

encode(#{ 'error' := Error
        }) ->
    #{ 'error' => Error
     }.
