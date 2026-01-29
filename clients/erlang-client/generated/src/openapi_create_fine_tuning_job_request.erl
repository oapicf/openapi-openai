-module(openapi_create_fine_tuning_job_request).

-export([encode/1]).

-export_type([openapi_create_fine_tuning_job_request/0]).

-type openapi_create_fine_tuning_job_request() ::
    #{ 'model' := openapi_create_fine_tuning_job_request_model:openapi_create_fine_tuning_job_request_model(),
       'training_file' := binary(),
       'hyperparameters' => openapi_create_fine_tuning_job_request_hyperparameters:openapi_create_fine_tuning_job_request_hyperparameters(),
       'suffix' => binary(),
       'validation_file' => binary(),
       'integrations' => list(),
       'seed' => integer()
     }.

encode(#{ 'model' := Model,
          'training_file' := TrainingFile,
          'hyperparameters' := Hyperparameters,
          'suffix' := Suffix,
          'validation_file' := ValidationFile,
          'integrations' := Integrations,
          'seed' := Seed
        }) ->
    #{ 'model' => Model,
       'training_file' => TrainingFile,
       'hyperparameters' => Hyperparameters,
       'suffix' => Suffix,
       'validation_file' => ValidationFile,
       'integrations' => Integrations,
       'seed' => Seed
     }.
