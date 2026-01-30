-module(openapi_fine_tune_preference_request_input).

-export([encode/1]).

-export_type([openapi_fine_tune_preference_request_input/0]).

-type openapi_fine_tune_preference_request_input() ::
    #{ 'input' => openapi_fine_tune_preference_request_input_input:openapi_fine_tune_preference_request_input_input(),
       'preferred_completion' => list(),
       'non_preferred_completion' => list()
     }.

encode(#{ 'input' := Input,
          'preferred_completion' := PreferredCompletion,
          'non_preferred_completion' := NonPreferredCompletion
        }) ->
    #{ 'input' => Input,
       'preferred_completion' => PreferredCompletion,
       'non_preferred_completion' => NonPreferredCompletion
     }.
