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
class CHAT_COMPLETION_REQUEST_ASSISTANT_MESSAGE_FUNCTION_CALL




feature --Access

    arguments: detachable STRING_32
      -- The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
    name: detachable STRING_32
      -- The name of the function to call.

feature -- Change Element

    set_arguments (a_name: like arguments)
        -- Set 'arguments' with 'a_name'.
      do
        arguments := a_name
      ensure
        arguments_set: arguments = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CHAT_COMPLETION_REQUEST_ASSISTANT_MESSAGE_FUNCTION_CALL%N")
        if attached arguments as l_arguments then
          Result.append ("%Narguments:")
          Result.append (l_arguments.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
      end
end
