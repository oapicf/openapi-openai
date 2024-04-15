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
class CHAT_COMPLETION_TOKEN_LOGPROB_TOP_LOGPROBS_INNER




feature --Access

    token: detachable STRING_32
      -- The token.
    logprob: REAL_32
      -- The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
    bytes: detachable LIST [INTEGER_32]
      -- A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.

feature -- Change Element

    set_token (a_name: like token)
        -- Set 'token' with 'a_name'.
      do
        token := a_name
      ensure
        token_set: token = a_name
      end

    set_logprob (a_name: like logprob)
        -- Set 'logprob' with 'a_name'.
      do
        logprob := a_name
      ensure
        logprob_set: logprob = a_name
      end

    set_bytes (a_name: like bytes)
        -- Set 'bytes' with 'a_name'.
      do
        bytes := a_name
      ensure
        bytes_set: bytes = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CHAT_COMPLETION_TOKEN_LOGPROB_TOP_LOGPROBS_INNER%N")
        if attached token as l_token then
          Result.append ("%Ntoken:")
          Result.append (l_token.out)
          Result.append ("%N")
        end
        if attached logprob as l_logprob then
          Result.append ("%Nlogprob:")
          Result.append (l_logprob.out)
          Result.append ("%N")
        end
        if attached bytes as l_bytes then
          across l_bytes as ic loop
            Result.append ("%N bytes:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end
