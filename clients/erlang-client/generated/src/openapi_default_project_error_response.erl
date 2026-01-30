-module(openapi_default_project_error_response).

-export([encode/1]).

-export_type([openapi_default_project_error_response/0]).

-type openapi_default_project_error_response() ::
    #{ 'code' := integer(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
