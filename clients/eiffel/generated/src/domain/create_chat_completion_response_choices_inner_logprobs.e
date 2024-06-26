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
class CREATE_CHAT_COMPLETION_RESPONSE_CHOICES_INNER_LOGPROBS




feature --Access

    content: detachable LIST [CHAT_COMPLETION_TOKEN_LOGPROB]
      -- A list of message content tokens with log probability information.

feature -- Change Element

    set_content (a_name: like content)
        -- Set 'content' with 'a_name'.
      do
        content := a_name
      ensure
        content_set: content = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_CHAT_COMPLETION_RESPONSE_CHOICES_INNER_LOGPROBS%N")
        if attached content as l_content then
          across l_content as ic loop
            Result.append ("%N content:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

