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
class CHAT_COMPLETION_STREAM_RESPONSE_DELTA




feature --Access

    content: detachable STRING_32
      -- The contents of the chunk message.
    function_call: detachable CHAT_COMPLETION_STREAM_RESPONSE_DELTA_FUNCTION_CALL
      
    tool_calls: detachable LIST [CHAT_COMPLETION_MESSAGE_TOOL_CALL_CHUNK]
      
    role: detachable STRING_32
      -- The role of the author of this message.

feature -- Change Element

    set_content (a_name: like content)
        -- Set 'content' with 'a_name'.
      do
        content := a_name
      ensure
        content_set: content = a_name
      end

    set_function_call (a_name: like function_call)
        -- Set 'function_call' with 'a_name'.
      do
        function_call := a_name
      ensure
        function_call_set: function_call = a_name
      end

    set_tool_calls (a_name: like tool_calls)
        -- Set 'tool_calls' with 'a_name'.
      do
        tool_calls := a_name
      ensure
        tool_calls_set: tool_calls = a_name
      end

    set_role (a_name: like role)
        -- Set 'role' with 'a_name'.
      do
        role := a_name
      ensure
        role_set: role = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CHAT_COMPLETION_STREAM_RESPONSE_DELTA%N")
        if attached content as l_content then
          Result.append ("%Ncontent:")
          Result.append (l_content.out)
          Result.append ("%N")
        end
        if attached function_call as l_function_call then
          Result.append ("%Nfunction_call:")
          Result.append (l_function_call.out)
          Result.append ("%N")
        end
        if attached tool_calls as l_tool_calls then
          across l_tool_calls as ic loop
            Result.append ("%N tool_calls:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached role as l_role then
          Result.append ("%Nrole:")
          Result.append (l_role.out)
          Result.append ("%N")
        end
      end
end
