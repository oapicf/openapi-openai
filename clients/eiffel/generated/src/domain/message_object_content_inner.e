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
class MESSAGE_OBJECT_CONTENT_INNER




feature --Access

    type: detachable STRING_32
      -- Always `image_file`.
    image_file: detachable MESSAGE_CONTENT_IMAGE_FILE_OBJECT_IMAGE_FILE
      
    text: detachable MESSAGE_CONTENT_TEXT_OBJECT_TEXT
      

feature -- Change Element

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_image_file (a_name: like image_file)
        -- Set 'image_file' with 'a_name'.
      do
        image_file := a_name
      ensure
        image_file_set: image_file = a_name
      end

    set_text (a_name: like text)
        -- Set 'text' with 'a_name'.
      do
        text := a_name
      ensure
        text_set: text = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass MESSAGE_OBJECT_CONTENT_INNER%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached image_file as l_image_file then
          Result.append ("%Nimage_file:")
          Result.append (l_image_file.out)
          Result.append ("%N")
        end
        if attached text as l_text then
          Result.append ("%Ntext:")
          Result.append (l_text.out)
          Result.append ("%N")
        end
      end
end
