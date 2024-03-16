-module(openapi_fine_tune).

-export([encode/1]).

-export_type([openapi_fine_tune/0]).

-type openapi_fine_tune() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'updated_at' := integer(),
       'model' := binary(),
       'fine_tuned_model' := binary(),
       'organization_id' := binary(),
       'status' := binary(),
       'hyperparams' := maps:map(),
       'training_files' := list(),
       'validation_files' := list(),
       'result_files' := list(),
       'events' => list()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'updated_at' := UpdatedAt,
          'model' := Model,
          'fine_tuned_model' := FineTunedModel,
          'organization_id' := OrganizationId,
          'status' := Status,
          'hyperparams' := Hyperparams,
          'training_files' := TrainingFiles,
          'validation_files' := ValidationFiles,
          'result_files' := ResultFiles,
          'events' := Events
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'updated_at' => UpdatedAt,
       'model' => Model,
       'fine_tuned_model' => FineTunedModel,
       'organization_id' => OrganizationId,
       'status' => Status,
       'hyperparams' => Hyperparams,
       'training_files' => TrainingFiles,
       'validation_files' => ValidationFiles,
       'result_files' => ResultFiles,
       'events' => Events
     }.
