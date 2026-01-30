-module(openapi_audit_log_rate_limit_updated_changes_requested).

-export([encode/1]).

-export_type([openapi_audit_log_rate_limit_updated_changes_requested/0]).

-type openapi_audit_log_rate_limit_updated_changes_requested() ::
    #{ 'max_requests_per_1_minute' => integer(),
       'max_tokens_per_1_minute' => integer(),
       'max_images_per_1_minute' => integer(),
       'max_audio_megabytes_per_1_minute' => integer(),
       'max_requests_per_1_day' => integer(),
       'batch_1_day_max_input_tokens' => integer()
     }.

encode(#{ 'max_requests_per_1_minute' := MaxRequestsPer1Minute,
          'max_tokens_per_1_minute' := MaxTokensPer1Minute,
          'max_images_per_1_minute' := MaxImagesPer1Minute,
          'max_audio_megabytes_per_1_minute' := MaxAudioMegabytesPer1Minute,
          'max_requests_per_1_day' := MaxRequestsPer1Day,
          'batch_1_day_max_input_tokens' := Batch1DayMaxInputTokens
        }) ->
    #{ 'max_requests_per_1_minute' => MaxRequestsPer1Minute,
       'max_tokens_per_1_minute' => MaxTokensPer1Minute,
       'max_images_per_1_minute' => MaxImagesPer1Minute,
       'max_audio_megabytes_per_1_minute' => MaxAudioMegabytesPer1Minute,
       'max_requests_per_1_day' => MaxRequestsPer1Day,
       'batch_1_day_max_input_tokens' => Batch1DayMaxInputTokens
     }.
