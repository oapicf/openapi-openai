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
class CREATE_TRANSCRIPTION_RESPONSE_VERBOSE_JSON




feature --Access

    language: detachable STRING_32
      -- The language of the input audio.
    duration: detachable STRING_32
      -- The duration of the input audio.
    text: detachable STRING_32
      -- The transcribed text.
    words: detachable LIST [TRANSCRIPTION_WORD]
      -- Extracted words and their corresponding timestamps.
    segments: detachable LIST [TRANSCRIPTION_SEGMENT]
      -- Segments of the transcribed text and their corresponding details.

feature -- Change Element

    set_language (a_name: like language)
        -- Set 'language' with 'a_name'.
      do
        language := a_name
      ensure
        language_set: language = a_name
      end

    set_duration (a_name: like duration)
        -- Set 'duration' with 'a_name'.
      do
        duration := a_name
      ensure
        duration_set: duration = a_name
      end

    set_text (a_name: like text)
        -- Set 'text' with 'a_name'.
      do
        text := a_name
      ensure
        text_set: text = a_name
      end

    set_words (a_name: like words)
        -- Set 'words' with 'a_name'.
      do
        words := a_name
      ensure
        words_set: words = a_name
      end

    set_segments (a_name: like segments)
        -- Set 'segments' with 'a_name'.
      do
        segments := a_name
      ensure
        segments_set: segments = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_TRANSCRIPTION_RESPONSE_VERBOSE_JSON%N")
        if attached language as l_language then
          Result.append ("%Nlanguage:")
          Result.append (l_language.out)
          Result.append ("%N")
        end
        if attached duration as l_duration then
          Result.append ("%Nduration:")
          Result.append (l_duration.out)
          Result.append ("%N")
        end
        if attached text as l_text then
          Result.append ("%Ntext:")
          Result.append (l_text.out)
          Result.append ("%N")
        end
        if attached words as l_words then
          across l_words as ic loop
            Result.append ("%N words:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached segments as l_segments then
          across l_segments as ic loop
            Result.append ("%N segments:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

