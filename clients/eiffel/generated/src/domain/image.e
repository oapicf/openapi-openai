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
class IMAGE




feature --Access

    b64_json: detachable STRING_32
      -- The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
    url: detachable STRING_32
      -- The URL of the generated image, if `response_format` is `url` (default).
    revised_prompt: detachable STRING_32
      -- The prompt that was used to generate the image, if there was any revision to the prompt.

feature -- Change Element

    set_b64_json (a_name: like b64_json)
        -- Set 'b64_json' with 'a_name'.
      do
        b64_json := a_name
      ensure
        b64_json_set: b64_json = a_name
      end

    set_url (a_name: like url)
        -- Set 'url' with 'a_name'.
      do
        url := a_name
      ensure
        url_set: url = a_name
      end

    set_revised_prompt (a_name: like revised_prompt)
        -- Set 'revised_prompt' with 'a_name'.
      do
        revised_prompt := a_name
      ensure
        revised_prompt_set: revised_prompt = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass IMAGE%N")
        if attached b64_json as l_b64_json then
          Result.append ("%Nb64_json:")
          Result.append (l_b64_json.out)
          Result.append ("%N")
        end
        if attached url as l_url then
          Result.append ("%Nurl:")
          Result.append (l_url.out)
          Result.append ("%N")
        end
        if attached revised_prompt as l_revised_prompt then
          Result.append ("%Nrevised_prompt:")
          Result.append (l_revised_prompt.out)
          Result.append ("%N")
        end
      end
end

