-module(openapi_create_fine_tuning_job_request_integrations_inner).

-export([encode/1]).

-export_type([openapi_create_fine_tuning_job_request_integrations_inner/0]).

-type openapi_create_fine_tuning_job_request_integrations_inner() ::
    #{ 'type' := binary(),
       'wandb' := openapi_create_fine_tuning_job_request_integrations_inner_wandb:openapi_create_fine_tuning_job_request_integrations_inner_wandb()
     }.

encode(#{ 'type' := Type,
          'wandb' := Wandb
        }) ->
    #{ 'type' => Type,
       'wandb' => Wandb
     }.
