-module(openapi_create_fine_tuning_job_request_integrations_inner_wandb).

-export([encode/1]).

-export_type([openapi_create_fine_tuning_job_request_integrations_inner_wandb/0]).

-type openapi_create_fine_tuning_job_request_integrations_inner_wandb() ::
    #{ 'project' := binary(),
       'name' => binary(),
       'entity' => binary(),
       'tags' => list()
     }.

encode(#{ 'project' := Project,
          'name' := Name,
          'entity' := Entity,
          'tags' := Tags
        }) ->
    #{ 'project' => Project,
       'name' => Name,
       'entity' => Entity,
       'tags' => Tags
     }.
