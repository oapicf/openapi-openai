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
class CHAT_COMPLETION_REQUEST_MESSAGE




feature --Access

    content: detachable STRING_32
      -- The contents of the function message.
    role: detachable STRING_32
      -- The role of the messages author, in this case `function`.
    name: detachable STRING_32
      -- The name of the function to call.
    tool_calls: detachable LIST [CHAT_COMPLETION_MESSAGE_TOOL_CALL]
      -- The tool calls generated by the model, such as function calls.
    function_call: detachable CHAT_COMPLETION_REQUEST_ASSISTANT_MESSAGE_FUNCTION_CALL
      
    tool_call_id: detachable STRING_32
      -- Tool call that this message is responding to.

feature -- Change Element

    set_content (a_name: like content)
        -- Set 'content' with 'a_name'.
      do
        content := a_name
      ensure
        content_set: content = a_name
      end

    set_role (a_name: like role)
        -- Set 'role' with 'a_name'.
      do
        role := a_name
      ensure
        role_set: role = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_tool_calls (a_name: like tool_calls)
        -- Set 'tool_calls' with 'a_name'.
      do
        tool_calls := a_name
      ensure
        tool_calls_set: tool_calls = a_name
      end

    set_function_call (a_name: like function_call)
        -- Set 'function_call' with 'a_name'.
      do
        function_call := a_name
      ensure
        function_call_set: function_call = a_name
      end

    set_tool_call_id (a_name: like tool_call_id)
        -- Set 'tool_call_id' with 'a_name'.
      do
        tool_call_id := a_name
      ensure
        tool_call_id_set: tool_call_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CHAT_COMPLETION_REQUEST_MESSAGE%N")
        if attached content as l_content then
          Result.append ("%Ncontent:")
          Result.append (l_content.out)
          Result.append ("%N")
        end
        if attached role as l_role then
          Result.append ("%Nrole:")
          Result.append (l_role.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached tool_calls as l_tool_calls then
          across l_tool_calls as ic loop
            Result.append ("%N tool_calls:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached function_call as l_function_call then
          Result.append ("%Nfunction_call:")
          Result.append (l_function_call.out)
          Result.append ("%N")
        end
        if attached tool_call_id as l_tool_call_id then
          Result.append ("%Ntool_call_id:")
          Result.append (l_tool_call_id.out)
          Result.append ("%N")
        end
      end
end

