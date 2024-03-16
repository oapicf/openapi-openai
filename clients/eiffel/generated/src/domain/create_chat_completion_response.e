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
class CREATE_CHAT_COMPLETION_RESPONSE




feature --Access

    id: detachable STRING_32
      
    object: detachable STRING_32
      
    created: INTEGER_32
      
    model: detachable STRING_32
      
    choices: detachable LIST [CREATE_CHAT_COMPLETION_RESPONSE_CHOICES_INNER]
      
    usage: detachable CREATE_COMPLETION_RESPONSE_USAGE
      

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_object (a_name: like object)
        -- Set 'object' with 'a_name'.
      do
        object := a_name
      ensure
        object_set: object = a_name
      end

    set_created (a_name: like created)
        -- Set 'created' with 'a_name'.
      do
        created := a_name
      ensure
        created_set: created = a_name
      end

    set_model (a_name: like model)
        -- Set 'model' with 'a_name'.
      do
        model := a_name
      ensure
        model_set: model = a_name
      end

    set_choices (a_name: like choices)
        -- Set 'choices' with 'a_name'.
      do
        choices := a_name
      ensure
        choices_set: choices = a_name
      end

    set_usage (a_name: like usage)
        -- Set 'usage' with 'a_name'.
      do
        usage := a_name
      ensure
        usage_set: usage = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_CHAT_COMPLETION_RESPONSE%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached object as l_object then
          Result.append ("%Nobject:")
          Result.append (l_object.out)
          Result.append ("%N")
        end
        if attached created as l_created then
          Result.append ("%Ncreated:")
          Result.append (l_created.out)
          Result.append ("%N")
        end
        if attached model as l_model then
          Result.append ("%Nmodel:")
          Result.append (l_model.out)
          Result.append ("%N")
        end
        if attached choices as l_choices then
          across l_choices as ic loop
            Result.append ("%N choices:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached usage as l_usage then
          Result.append ("%Nusage:")
          Result.append (l_usage.out)
          Result.append ("%N")
        end
      end
end

