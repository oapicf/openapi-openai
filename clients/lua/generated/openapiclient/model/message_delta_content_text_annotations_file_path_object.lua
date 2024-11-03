--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- message_delta_content_text_annotations_file_path_object class
local message_delta_content_text_annotations_file_path_object = {}
local message_delta_content_text_annotations_file_path_object_mt = {
	__name = "message_delta_content_text_annotations_file_path_object";
	__index = message_delta_content_text_annotations_file_path_object;
}

local function cast_message_delta_content_text_annotations_file_path_object(t)
	return setmetatable(t, message_delta_content_text_annotations_file_path_object_mt)
end

local function new_message_delta_content_text_annotations_file_path_object(index, type, text, file_path, start_index, end_index)
	return cast_message_delta_content_text_annotations_file_path_object({
		["index"] = index;
		["type"] = type;
		["text"] = text;
		["file_path"] = file_path;
		["start_index"] = start_index;
		["end_index"] = end_index;
	})
end

return {
	cast = cast_message_delta_content_text_annotations_file_path_object;
	new = new_message_delta_content_text_annotations_file_path_object;
}
