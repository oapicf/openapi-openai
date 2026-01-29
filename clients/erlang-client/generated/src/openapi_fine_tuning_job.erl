-module(openapi_fine_tuning_job).

-export([encode/1]).

-export_type([openapi_fine_tuning_job/0]).

-type openapi_fine_tuning_job() ::
    #{ 'id' := binary(),
       'created_at' := integer(),
       'error' := openapi_fine_tuning_job_error:openapi_fine_tuning_job_error(),
       'fine_tuned_model' := binary(),
       'finished_at' := integer(),
       'hyperparameters' := openapi_fine_tuning_job_hyperparameters:openapi_fine_tuning_job_hyperparameters(),
       'model' := binary(),
       'object' := binary(),
       'organization_id' := binary(),
       'result_files' := list(),
       'status' := binary(),
       'trained_tokens' := integer(),
       'training_file' := binary(),
       'validation_file' := binary(),
       'integrations' => list(),
       'seed' := integer()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'error' := Error,
          'fine_tuned_model' := FineTunedModel,
          'finished_at' := FinishedAt,
          'hyperparameters' := Hyperparameters,
          'model' := Model,
          'object' := Object,
          'organization_id' := OrganizationId,
          'result_files' := ResultFiles,
          'status' := Status,
          'trained_tokens' := TrainedTokens,
          'training_file' := TrainingFile,
          'validation_file' := ValidationFile,
          'integrations' := Integrations,
          'seed' := Seed
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'error' => Error,
       'fine_tuned_model' => FineTunedModel,
       'finished_at' => FinishedAt,
       'hyperparameters' => Hyperparameters,
       'model' => Model,
       'object' => Object,
       'organization_id' => OrganizationId,
       'result_files' => ResultFiles,
       'status' => Status,
       'trained_tokens' => TrainedTokens,
       'training_file' => TrainingFile,
       'validation_file' => ValidationFile,
       'integrations' => Integrations,
       'seed' => Seed
     }.
