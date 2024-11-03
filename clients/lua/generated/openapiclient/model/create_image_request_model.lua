--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_image_request_model class
local create_image_request_model = {}
local create_image_request_model_mt = {
	__name = "create_image_request_model";
	__index = create_image_request_model;
}

local function cast_create_image_request_model(t)
	return setmetatable(t, create_image_request_model_mt)
end

local function new_create_image_request_model()
	return cast_create_image_request_model({
	})
end

return {
	cast = cast_create_image_request_model;
	new = new_create_image_request_model;
}
