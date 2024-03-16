--[[
  OpenAI API

  APIs for sampling from and fine-tuning language models

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_edit_response class
local create_edit_response = {}
local create_edit_response_mt = {
	__name = "create_edit_response";
	__index = create_edit_response;
}

local function cast_create_edit_response(t)
	return setmetatable(t, create_edit_response_mt)
end

local function new_create_edit_response(object, created, choices, usage)
	return cast_create_edit_response({
		["object"] = object;
		["created"] = created;
		["choices"] = choices;
		["usage"] = usage;
	})
end

return {
	cast = cast_create_edit_response;
	new = new_create_edit_response;
}
