-module(openapi_run_step_delta_object_delta).

-export([encode/1]).

-export_type([openapi_run_step_delta_object_delta/0]).

-type openapi_run_step_delta_object_delta() ::
    #{ 'step_details' => openapi_run_step_delta_object_delta_step_details:openapi_run_step_delta_object_delta_step_details()
     }.

encode(#{ 'step_details' := StepDetails
        }) ->
    #{ 'step_details' => StepDetails
     }.
