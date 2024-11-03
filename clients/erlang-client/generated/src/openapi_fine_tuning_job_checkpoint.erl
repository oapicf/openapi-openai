-module(openapi_fine_tuning_job_checkpoint).

-export([encode/1]).

-export_type([openapi_fine_tuning_job_checkpoint/0]).

-type openapi_fine_tuning_job_checkpoint() ::
    #{ 'id' := binary(),
       'created_at' := integer(),
       'fine_tuned_model_checkpoint' := binary(),
       'step_number' := integer(),
       'metrics' := openapi_fine_tuning_job_checkpoint_metrics:openapi_fine_tuning_job_checkpoint_metrics(),
       'fine_tuning_job_id' := binary(),
       'object' := binary()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'fine_tuned_model_checkpoint' := FineTunedModelCheckpoint,
          'step_number' := StepNumber,
          'metrics' := Metrics,
          'fine_tuning_job_id' := FineTuningJobId,
          'object' := Object
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'fine_tuned_model_checkpoint' => FineTunedModelCheckpoint,
       'step_number' => StepNumber,
       'metrics' => Metrics,
       'fine_tuning_job_id' => FineTuningJobId,
       'object' => Object
     }.
