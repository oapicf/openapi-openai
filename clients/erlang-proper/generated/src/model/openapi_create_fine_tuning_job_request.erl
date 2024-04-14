-module(openapi_create_fine_tuning_job_request).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request/0]).

-export([openapi_create_fine_tuning_job_request/1]).

-export_type([openapi_create_fine_tuning_job_request/0]).

-type openapi_create_fine_tuning_job_request() ::
  [ {'model', openapi_create_fine_tuning_job_request_model:openapi_create_fine_tuning_job_request_model() }
  | {'training_file', binary() }
  | {'hyperparameters', openapi_create_fine_tuning_job_request_hyperparameters:openapi_create_fine_tuning_job_request_hyperparameters() }
  | {'suffix', binary() }
  | {'validation_file', binary() }
  | {'integrations', list(openapi_create_fine_tuning_job_request_integrations_inner:openapi_create_fine_tuning_job_request_integrations_inner()) }
  | {'seed', integer() }
  ].


openapi_create_fine_tuning_job_request() ->
    openapi_create_fine_tuning_job_request([]).

openapi_create_fine_tuning_job_request(Fields) ->
  Default = [ {'model', openapi_create_fine_tuning_job_request_model:openapi_create_fine_tuning_job_request_model() }
            , {'training_file', binary() }
            , {'hyperparameters', openapi_create_fine_tuning_job_request_hyperparameters:openapi_create_fine_tuning_job_request_hyperparameters() }
            , {'suffix', binary(1, 40) }
            , {'validation_file', binary() }
            , {'integrations', list(openapi_create_fine_tuning_job_request_integrations_inner:openapi_create_fine_tuning_job_request_integrations_inner()) }
            , {'seed', integer(0, 2147483647) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

