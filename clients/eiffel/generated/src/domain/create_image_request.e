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
class CREATE_IMAGE_REQUEST




feature --Access

    prompt: detachable STRING_32
      -- A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
    model: detachable CREATE_IMAGE_REQUEST_MODEL
      
    n: INTEGER_32
      -- The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
    quality: detachable STRING_32
      -- The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
    response_format: detachable STRING_32
      -- The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    size: detachable STRING_32
      -- The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
    style: detachable STRING_32
      -- The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
    user: detachable STRING_32
      -- A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

feature -- Change Element

    set_prompt (a_name: like prompt)
        -- Set 'prompt' with 'a_name'.
      do
        prompt := a_name
      ensure
        prompt_set: prompt = a_name
      end

    set_model (a_name: like model)
        -- Set 'model' with 'a_name'.
      do
        model := a_name
      ensure
        model_set: model = a_name
      end

    set_n (a_name: like n)
        -- Set 'n' with 'a_name'.
      do
        n := a_name
      ensure
        n_set: n = a_name
      end

    set_quality (a_name: like quality)
        -- Set 'quality' with 'a_name'.
      do
        quality := a_name
      ensure
        quality_set: quality = a_name
      end

    set_response_format (a_name: like response_format)
        -- Set 'response_format' with 'a_name'.
      do
        response_format := a_name
      ensure
        response_format_set: response_format = a_name
      end

    set_size (a_name: like size)
        -- Set 'size' with 'a_name'.
      do
        size := a_name
      ensure
        size_set: size = a_name
      end

    set_style (a_name: like style)
        -- Set 'style' with 'a_name'.
      do
        style := a_name
      ensure
        style_set: style = a_name
      end

    set_user (a_name: like user)
        -- Set 'user' with 'a_name'.
      do
        user := a_name
      ensure
        user_set: user = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_IMAGE_REQUEST%N")
        if attached prompt as l_prompt then
          Result.append ("%Nprompt:")
          Result.append (l_prompt.out)
          Result.append ("%N")
        end
        if attached model as l_model then
          Result.append ("%Nmodel:")
          Result.append (l_model.out)
          Result.append ("%N")
        end
        if attached n as l_n then
          Result.append ("%Nn:")
          Result.append (l_n.out)
          Result.append ("%N")
        end
        if attached quality as l_quality then
          Result.append ("%Nquality:")
          Result.append (l_quality.out)
          Result.append ("%N")
        end
        if attached response_format as l_response_format then
          Result.append ("%Nresponse_format:")
          Result.append (l_response_format.out)
          Result.append ("%N")
        end
        if attached size as l_size then
          Result.append ("%Nsize:")
          Result.append (l_size.out)
          Result.append ("%N")
        end
        if attached style as l_style then
          Result.append ("%Nstyle:")
          Result.append (l_style.out)
          Result.append ("%N")
        end
        if attached user as l_user then
          Result.append ("%Nuser:")
          Result.append (l_user.out)
          Result.append ("%N")
        end
      end
end
