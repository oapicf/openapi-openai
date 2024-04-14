-module(openapi_create_fine_tuning_job_request_integrations_inner_wandb).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request_integrations_inner_wandb/0]).

-export([openapi_create_fine_tuning_job_request_integrations_inner_wandb/1]).

-export_type([openapi_create_fine_tuning_job_request_integrations_inner_wandb/0]).

-type openapi_create_fine_tuning_job_request_integrations_inner_wandb() ::
  [ {'project', binary() }
  | {'name', binary() }
  | {'entity', binary() }
  | {'tags', list(binary()) }
  ].


openapi_create_fine_tuning_job_request_integrations_inner_wandb() ->
    openapi_create_fine_tuning_job_request_integrations_inner_wandb([]).

openapi_create_fine_tuning_job_request_integrations_inner_wandb(Fields) ->
  Default = [ {'project', binary() }
            , {'name', binary() }
            , {'entity', binary() }
            , {'tags', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

