note
 description:"[
		OpenAI API
 		APIs for sampling from and fine-tuning language models
  		The version of the OpenAPI document: 2.0.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class LIST_MODELS_RESPONSE




feature --Access

    object: detachable STRING_32
      
    data: detachable LIST [MODEL]
      

feature -- Change Element

    set_object (a_name: like object)
        -- Set 'object' with 'a_name'.
      do
        object := a_name
      ensure
        object_set: object = a_name
      end

    set_data (a_name: like data)
        -- Set 'data' with 'a_name'.
      do
        data := a_name
      ensure
        data_set: data = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass LIST_MODELS_RESPONSE%N")
        if attached object as l_object then
          Result.append ("%Nobject:")
          Result.append (l_object.out)
          Result.append ("%N")
        end
        if attached data as l_data then
          across l_data as ic loop
            Result.append ("%N data:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end
