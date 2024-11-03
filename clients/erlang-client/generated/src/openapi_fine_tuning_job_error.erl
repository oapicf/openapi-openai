-module(openapi_fine_tuning_job_error).

-export([encode/1]).

-export_type([openapi_fine_tuning_job_error/0]).

-type openapi_fine_tuning_job_error() ::
    #{ 'code' := binary(),
       'message' := binary(),
       'param' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message,
          'param' := Param
        }) ->
    #{ 'code' => Code,
       'message' => Message,
       'param' => Param
     }.
