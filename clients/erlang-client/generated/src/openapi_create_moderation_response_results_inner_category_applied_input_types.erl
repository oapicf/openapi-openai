-module(openapi_create_moderation_response_results_inner_category_applied_input_types).

-export([encode/1]).

-export_type([openapi_create_moderation_response_results_inner_category_applied_input_types/0]).

-type openapi_create_moderation_response_results_inner_category_applied_input_types() ::
    #{ 'hate' := list(),
       'hate_threatening' := list(),
       'harassment' := list(),
       'harassment_threatening' := list(),
       'illicit' := list(),
       'illicit_violent' := list(),
       'self_harm' := list(),
       'self_harm_intent' := list(),
       'self_harm_instructions' := list(),
       'sexual' := list(),
       'sexual_minors' := list(),
       'violence' := list(),
       'violence_graphic' := list()
     }.

encode(#{ 'hate' := Hate,
          'hate_threatening' := HateThreatening,
          'harassment' := Harassment,
          'harassment_threatening' := HarassmentThreatening,
          'illicit' := Illicit,
          'illicit_violent' := IllicitViolent,
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
       'illicit' => Illicit,
       'illicit/violent' => IllicitViolent,
       'self-harm' => SelfHarm,
       'self-harm/intent' => SelfHarmIntent,
       'self-harm/instructions' => SelfHarmInstructions,
       'sexual' => Sexual,
       'sexual/minors' => SexualMinors,
       'violence' => Violence,
       'violence/graphic' => ViolenceGraphic
     }.
