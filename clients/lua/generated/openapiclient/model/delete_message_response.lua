--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- delete_message_response class
local delete_message_response = {}
local delete_message_response_mt = {
	__name = "delete_message_response";
	__index = delete_message_response;
}

local function cast_delete_message_response(t)
	return setmetatable(t, delete_message_response_mt)
end

local function new_delete_message_response(id, deleted, object)
	return cast_delete_message_response({
		["id"] = id;
		["deleted"] = deleted;
		["object"] = object;
	})
end

return {
	cast = cast_delete_message_response;
	new = new_delete_message_response;
}