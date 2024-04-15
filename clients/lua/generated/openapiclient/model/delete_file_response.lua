--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- delete_file_response class
local delete_file_response = {}
local delete_file_response_mt = {
	__name = "delete_file_response";
	__index = delete_file_response;
}

local function cast_delete_file_response(t)
	return setmetatable(t, delete_file_response_mt)
end

local function new_delete_file_response(id, object, deleted)
	return cast_delete_file_response({
		["id"] = id;
		["object"] = object;
		["deleted"] = deleted;
	})
end

return {
	cast = cast_delete_file_response;
	new = new_delete_file_response;
}