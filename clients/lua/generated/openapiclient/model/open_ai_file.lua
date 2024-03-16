--[[
  OpenAI API

  APIs for sampling from and fine-tuning language models

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- open_ai_file class
local open_ai_file = {}
local open_ai_file_mt = {
	__name = "open_ai_file";
	__index = open_ai_file;
}

local function cast_open_ai_file(t)
	return setmetatable(t, open_ai_file_mt)
end

local function new_open_ai_file(id, object, bytes, created_at, filename, purpose, status, status_details)
	return cast_open_ai_file({
		["id"] = id;
		["object"] = object;
		["bytes"] = bytes;
		["created_at"] = created_at;
		["filename"] = filename;
		["purpose"] = purpose;
		["status"] = status;
		["status_details"] = status_details;
	})
end

return {
	cast = cast_open_ai_file;
	new = new_open_ai_file;
}