-module(openapi_fine_tuning_job_checkpoint_metrics).

-export([encode/1]).

-export_type([openapi_fine_tuning_job_checkpoint_metrics/0]).

-type openapi_fine_tuning_job_checkpoint_metrics() ::
    #{ 'step' => integer(),
       'train_loss' => integer(),
       'train_mean_token_accuracy' => integer(),
       'valid_loss' => integer(),
       'valid_mean_token_accuracy' => integer(),
       'full_valid_loss' => integer(),
       'full_valid_mean_token_accuracy' => integer()
     }.

encode(#{ 'step' := Step,
          'train_loss' := TrainLoss,
          'train_mean_token_accuracy' := TrainMeanTokenAccuracy,
          'valid_loss' := ValidLoss,
          'valid_mean_token_accuracy' := ValidMeanTokenAccuracy,
          'full_valid_loss' := FullValidLoss,
          'full_valid_mean_token_accuracy' := FullValidMeanTokenAccuracy
        }) ->
    #{ 'step' => Step,
       'train_loss' => TrainLoss,
       'train_mean_token_accuracy' => TrainMeanTokenAccuracy,
       'valid_loss' => ValidLoss,
       'valid_mean_token_accuracy' => ValidMeanTokenAccuracy,
       'full_valid_loss' => FullValidLoss,
       'full_valid_mean_token_accuracy' => FullValidMeanTokenAccuracy
     }.
