-module(openapi_create_fine_tuning_job_request_integrations_inner_type).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request_integrations_inner_type/0]).

-export([openapi_create_fine_tuning_job_request_integrations_inner_type/1]).

-export_type([openapi_create_fine_tuning_job_request_integrations_inner_type/0]).

-type openapi_create_fine_tuning_job_request_integrations_inner_type() ::
  [ 
  ].


openapi_create_fine_tuning_job_request_integrations_inner_type() ->
    openapi_create_fine_tuning_job_request_integrations_inner_type([]).

openapi_create_fine_tuning_job_request_integrations_inner_type(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

