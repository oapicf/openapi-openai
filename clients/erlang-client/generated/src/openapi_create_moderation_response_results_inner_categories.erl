-module(openapi_create_moderation_response_results_inner_categories).

-export([encode/1]).

-export_type([openapi_create_moderation_response_results_inner_categories/0]).

-type openapi_create_moderation_response_results_inner_categories() ::
    #{ 'hate' := boolean(),
       'hate_threatening' := boolean(),
       'harassment' := boolean(),
       'harassment_threatening' := boolean(),
       'illicit' := boolean(),
       'illicit_violent' := boolean(),
       'self_harm' := boolean(),
       'self_harm_intent' := boolean(),
       'self_harm_instructions' := boolean(),
       'sexual' := boolean(),
       'sexual_minors' := boolean(),
       'violence' := boolean(),
       'violence_graphic' := boolean()
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
