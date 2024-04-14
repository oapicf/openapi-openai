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
class ASSISTANT_OBJECT_TOOLS_INNER




feature --Access

    type: detachable STRING_32
      -- The type of tool being defined: `code_interpreter`
    function: detachable FUNCTION_OBJECT
      

feature -- Change Element

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_function (a_name: like function)
        -- Set 'function' with 'a_name'.
      do
        function := a_name
      ensure
        function_set: function = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ASSISTANT_OBJECT_TOOLS_INNER%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached function as l_function then
          Result.append ("%Nfunction:")
          Result.append (l_function.out)
          Result.append ("%N")
        end
      end
end

