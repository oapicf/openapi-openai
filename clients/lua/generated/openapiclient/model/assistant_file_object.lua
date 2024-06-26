--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- assistant_file_object class
local assistant_file_object = {}
local assistant_file_object_mt = {
	__name = "assistant_file_object";
	__index = assistant_file_object;
}

local function cast_assistant_file_object(t)
	return setmetatable(t, assistant_file_object_mt)
end

local function new_assistant_file_object(id, object, created_at, assistant_id)
	return cast_assistant_file_object({
		["id"] = id;
		["object"] = object;
		["created_at"] = created_at;
		["assistant_id"] = assistant_id;
	})
end

return {
	cast = cast_assistant_file_object;
	new = new_assistant_file_object;
}
