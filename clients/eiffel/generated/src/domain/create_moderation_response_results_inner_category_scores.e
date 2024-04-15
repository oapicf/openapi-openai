note
 description:"[
		OpenAI API
 		The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
  		The version of the OpenAPI document: 2.0.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CREATE_MODERATION_RESPONSE_RESULTS_INNER_CATEGORY_SCORES




feature --Access

    hate: REAL_32
      -- The score for the category 'hate'.
    hate_threatening: REAL_32
      -- The score for the category 'hate/threatening'.
    harassment: REAL_32
      -- The score for the category 'harassment'.
    harassment_threatening: REAL_32
      -- The score for the category 'harassment/threatening'.
    self_harm: REAL_32
      -- The score for the category 'self-harm'.
    self_harm_intent: REAL_32
      -- The score for the category 'self-harm/intent'.
    self_harm_instructions: REAL_32
      -- The score for the category 'self-harm/instructions'.
    sexual: REAL_32
      -- The score for the category 'sexual'.
    sexual_minors: REAL_32
      -- The score for the category 'sexual/minors'.
    violence: REAL_32
      -- The score for the category 'violence'.
    violence_graphic: REAL_32
      -- The score for the category 'violence/graphic'.

feature -- Change Element

    set_hate (a_name: like hate)
        -- Set 'hate' with 'a_name'.
      do
        hate := a_name
      ensure
        hate_set: hate = a_name
      end

    set_hate_threatening (a_name: like hate_threatening)
        -- Set 'hate_threatening' with 'a_name'.
      do
        hate_threatening := a_name
      ensure
        hate_threatening_set: hate_threatening = a_name
      end

    set_harassment (a_name: like harassment)
        -- Set 'harassment' with 'a_name'.
      do
        harassment := a_name
      ensure
        harassment_set: harassment = a_name
      end

    set_harassment_threatening (a_name: like harassment_threatening)
        -- Set 'harassment_threatening' with 'a_name'.
      do
        harassment_threatening := a_name
      ensure
        harassment_threatening_set: harassment_threatening = a_name
      end

    set_self_harm (a_name: like self_harm)
        -- Set 'self_harm' with 'a_name'.
      do
        self_harm := a_name
      ensure
        self_harm_set: self_harm = a_name
      end

    set_self_harm_intent (a_name: like self_harm_intent)
        -- Set 'self_harm_intent' with 'a_name'.
      do
        self_harm_intent := a_name
      ensure
        self_harm_intent_set: self_harm_intent = a_name
      end

    set_self_harm_instructions (a_name: like self_harm_instructions)
        -- Set 'self_harm_instructions' with 'a_name'.
      do
        self_harm_instructions := a_name
      ensure
        self_harm_instructions_set: self_harm_instructions = a_name
      end

    set_sexual (a_name: like sexual)
        -- Set 'sexual' with 'a_name'.
      do
        sexual := a_name
      ensure
        sexual_set: sexual = a_name
      end

    set_sexual_minors (a_name: like sexual_minors)
        -- Set 'sexual_minors' with 'a_name'.
      do
        sexual_minors := a_name
      ensure
        sexual_minors_set: sexual_minors = a_name
      end

    set_violence (a_name: like violence)
        -- Set 'violence' with 'a_name'.
      do
        violence := a_name
      ensure
        violence_set: violence = a_name
      end

    set_violence_graphic (a_name: like violence_graphic)
        -- Set 'violence_graphic' with 'a_name'.
      do
        violence_graphic := a_name
      ensure
        violence_graphic_set: violence_graphic = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_MODERATION_RESPONSE_RESULTS_INNER_CATEGORY_SCORES%N")
        if attached hate as l_hate then
          Result.append ("%Nhate:")
          Result.append (l_hate.out)
          Result.append ("%N")
        end
        if attached hate_threatening as l_hate_threatening then
          Result.append ("%Nhate_threatening:")
          Result.append (l_hate_threatening.out)
          Result.append ("%N")
        end
        if attached harassment as l_harassment then
          Result.append ("%Nharassment:")
          Result.append (l_harassment.out)
          Result.append ("%N")
        end
        if attached harassment_threatening as l_harassment_threatening then
          Result.append ("%Nharassment_threatening:")
          Result.append (l_harassment_threatening.out)
          Result.append ("%N")
        end
        if attached self_harm as l_self_harm then
          Result.append ("%Nself_harm:")
          Result.append (l_self_harm.out)
          Result.append ("%N")
        end
        if attached self_harm_intent as l_self_harm_intent then
          Result.append ("%Nself_harm_intent:")
          Result.append (l_self_harm_intent.out)
          Result.append ("%N")
        end
        if attached self_harm_instructions as l_self_harm_instructions then
          Result.append ("%Nself_harm_instructions:")
          Result.append (l_self_harm_instructions.out)
          Result.append ("%N")
        end
        if attached sexual as l_sexual then
          Result.append ("%Nsexual:")
          Result.append (l_sexual.out)
          Result.append ("%N")
        end
        if attached sexual_minors as l_sexual_minors then
          Result.append ("%Nsexual_minors:")
          Result.append (l_sexual_minors.out)
          Result.append ("%N")
        end
        if attached violence as l_violence then
          Result.append ("%Nviolence:")
          Result.append (l_violence.out)
          Result.append ("%N")
        end
        if attached violence_graphic as l_violence_graphic then
          Result.append ("%Nviolence_graphic:")
          Result.append (l_violence_graphic.out)
          Result.append ("%N")
        end
      end
end
