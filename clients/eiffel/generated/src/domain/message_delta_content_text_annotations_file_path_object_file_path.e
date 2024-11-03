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
class MESSAGE_DELTA_CONTENT_TEXT_ANNOTATIONS_FILE_PATH_OBJECT_FILE_PATH




feature --Access

    file_id: detachable STRING_32
      -- The ID of the file that was generated.

feature -- Change Element

    set_file_id (a_name: like file_id)
        -- Set 'file_id' with 'a_name'.
      do
        file_id := a_name
      ensure
        file_id_set: file_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass MESSAGE_DELTA_CONTENT_TEXT_ANNOTATIONS_FILE_PATH_OBJECT_FILE_PATH%N")
        if attached file_id as l_file_id then
          Result.append ("%Nfile_id:")
          Result.append (l_file_id.out)
          Result.append ("%N")
        end
      end
end

