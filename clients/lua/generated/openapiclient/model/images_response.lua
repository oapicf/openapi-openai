--[[
  OpenAI API

  APIs for sampling from and fine-tuning language models

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- images_response class
local images_response = {}
local images_response_mt = {
	__name = "images_response";
	__index = images_response;
}

local function cast_images_response(t)
	return setmetatable(t, images_response_mt)
end

local function new_images_response(created, data)
	return cast_images_response({
		["created"] = created;
		["data"] = data;
	})
end

return {
	cast = cast_images_response;
	new = new_images_response;
}
