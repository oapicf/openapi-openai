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
class ERROR_RESPONSE




feature --Access

    error: detachable ERROR
      

feature -- Change Element

    set_error (a_name: like error)
        -- Set 'error' with 'a_name'.
      do
        error := a_name
      ensure
        error_set: error = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ERROR_RESPONSE%N")
        if attached error as l_error then
          Result.append ("%Nerror:")
          Result.append (l_error.out)
          Result.append ("%N")
        end
      end
end
