-module(openapi_create_moderation_response_results_inner_category_scores).

-export([encode/1]).

-export_type([openapi_create_moderation_response_results_inner_category_scores/0]).

-type openapi_create_moderation_response_results_inner_category_scores() ::
    #{ 'hate' := integer(),
       'hate_threatening' := integer(),
       'harassment' := integer(),
       'harassment_threatening' := integer(),
       'self_harm' := integer(),
       'self_harm_intent' := integer(),
       'self_harm_instructions' := integer(),
       'sexual' := integer(),
       'sexual_minors' := integer(),
       'violence' := integer(),
       'violence_graphic' := integer()
     }.

encode(#{ 'hate' := Hate,
          'hate_threatening' := HateThreatening,
          'harassment' := Harassment,
          'harassment_threatening' := HarassmentThreatening,
          'self_harm' := SelfHarm,
          'self_harm_intent' := SelfHarmIntent,
          'self_harm_instructions' := SelfHarmInstructions,
          'sexual' := Sexual,
          'sexual_minors' := SexualMinors,
          'violence' := Violence,
          'violence_graphic' := ViolenceGraphic
        }) ->
    #{ 'hate' => Hate,
       'hate/threatening' => HateThreatening,
       'harassment' => Harassment,
       'harassment/threatening' => HarassmentThreatening,
       'self-harm' => SelfHarm,
       'self-harm/intent' => SelfHarmIntent,
       'self-harm/instructions' => SelfHarmInstructions,
       'sexual' => Sexual,
       'sexual/minors' => SexualMinors,
       'violence' => Violence,
       'violence/graphic' => ViolenceGraphic
     }.
