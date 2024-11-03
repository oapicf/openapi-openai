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
class CREATE_CHAT_COMPLETION_FUNCTION_RESPONSE_CHOICES_INNER




feature --Access

    finish_reason: detachable STRING_32
      -- The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
    index: INTEGER_32
      -- The index of the choice in the list of choices.
    message: detachable CHAT_COMPLETION_RESPONSE_MESSAGE
      

feature -- Change Element

    set_finish_reason (a_name: like finish_reason)
        -- Set 'finish_reason' with 'a_name'.
      do
        finish_reason := a_name
      ensure
        finish_reason_set: finish_reason = a_name
      end

    set_index (a_name: like index)
        -- Set 'index' with 'a_name'.
      do
        index := a_name
      ensure
        index_set: index = a_name
      end

    set_message (a_name: like message)
        -- Set 'message' with 'a_name'.
      do
        message := a_name
      ensure
        message_set: message = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_CHAT_COMPLETION_FUNCTION_RESPONSE_CHOICES_INNER%N")
        if attached finish_reason as l_finish_reason then
          Result.append ("%Nfinish_reason:")
          Result.append (l_finish_reason.out)
          Result.append ("%N")
        end
        if attached index as l_index then
          Result.append ("%Nindex:")
          Result.append (l_index.out)
          Result.append ("%N")
        end
        if attached message as l_message then
          Result.append ("%Nmessage:")
          Result.append (l_message.out)
          Result.append ("%N")
        end
      end
end

