--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- message_object class
local message_object = {}
local message_object_mt = {
	__name = "message_object";
	__index = message_object;
}

local function cast_message_object(t)
	return setmetatable(t, message_object_mt)
end

local function new_message_object(id, object, created_at, thread_id, status, incomplete_details, completed_at, incomplete_at, role, content, assistant_id, run_id, file_ids, metadata)
	return cast_message_object({
		["id"] = id;
		["object"] = object;
		["created_at"] = created_at;
		["thread_id"] = thread_id;
		["status"] = status;
		["incomplete_details"] = incomplete_details;
		["completed_at"] = completed_at;
		["incomplete_at"] = incomplete_at;
		["role"] = role;
		["content"] = content;
		["assistant_id"] = assistant_id;
		["run_id"] = run_id;
		["file_ids"] = file_ids;
		["metadata"] = metadata;
	})
end

return {
	cast = cast_message_object;
	new = new_message_object;
}
