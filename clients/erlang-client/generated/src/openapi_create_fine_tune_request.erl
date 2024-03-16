-module(openapi_create_fine_tune_request).

-export([encode/1]).

-export_type([openapi_create_fine_tune_request/0]).

-type openapi_create_fine_tune_request() ::
    #{ 'training_file' := binary(),
       'validation_file' => binary(),
       'model' => openapi_create_fine_tune_request_model:openapi_create_fine_tune_request_model(),
       'n_epochs' => integer(),
       'batch_size' => integer(),
       'learning_rate_multiplier' => integer(),
       'prompt_loss_weight' => integer(),
       'compute_classification_metrics' => boolean(),
       'classification_n_classes' => integer(),
       'classification_positive_class' => binary(),
       'classification_betas' => list(),
       'suffix' => binary()
     }.

encode(#{ 'training_file' := TrainingFile,
          'validation_file' := ValidationFile,
          'model' := Model,
          'n_epochs' := NEpochs,
          'batch_size' := BatchSize,
          'learning_rate_multiplier' := LearningRateMultiplier,
          'prompt_loss_weight' := PromptLossWeight,
          'compute_classification_metrics' := ComputeClassificationMetrics,
          'classification_n_classes' := ClassificationNClasses,
          'classification_positive_class' := ClassificationPositiveClass,
          'classification_betas' := ClassificationBetas,
          'suffix' := Suffix
        }) ->
    #{ 'training_file' => TrainingFile,
       'validation_file' => ValidationFile,
       'model' => Model,
       'n_epochs' => NEpochs,
       'batch_size' => BatchSize,
       'learning_rate_multiplier' => LearningRateMultiplier,
       'prompt_loss_weight' => PromptLossWeight,
       'compute_classification_metrics' => ComputeClassificationMetrics,
       'classification_n_classes' => ClassificationNClasses,
       'classification_positive_class' => ClassificationPositiveClass,
       'classification_betas' => ClassificationBetas,
       'suffix' => Suffix
     }.
