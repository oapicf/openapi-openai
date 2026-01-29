-module(openapi_fine_tuning_integration).

-export([encode/1]).

-export_type([openapi_fine_tuning_integration/0]).

-type openapi_fine_tuning_integration() ::
    #{ 'type' := binary(),
       'wandb' := openapi_create_fine_tuning_job_request_integrations_inner_wandb:openapi_create_fine_tuning_job_request_integrations_inner_wandb()
     }.

encode(#{ 'type' := Type,
          'wandb' := Wandb
        }) ->
    #{ 'type' => Type,
       'wandb' => Wandb
     }.
