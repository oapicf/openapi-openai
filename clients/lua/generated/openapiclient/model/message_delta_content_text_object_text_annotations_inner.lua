--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- message_delta_content_text_object_text_annotations_inner class
local message_delta_content_text_object_text_annotations_inner = {}
local message_delta_content_text_object_text_annotations_inner_mt = {
	__name = "message_delta_content_text_object_text_annotations_inner";
	__index = message_delta_content_text_object_text_annotations_inner;
}

local function cast_message_delta_content_text_object_text_annotations_inner(t)
	return setmetatable(t, message_delta_content_text_object_text_annotations_inner_mt)
end

local function new_message_delta_content_text_object_text_annotations_inner(index, type, text, file_citation, start_index, end_index, file_path)
	return cast_message_delta_content_text_object_text_annotations_inner({
		["index"] = index;
		["type"] = type;
		["text"] = text;
		["file_citation"] = file_citation;
		["start_index"] = start_index;
		["end_index"] = end_index;
		["file_path"] = file_path;
	})
end

return {
	cast = cast_message_delta_content_text_object_text_annotations_inner;
	new = new_message_delta_content_text_object_text_annotations_inner;
}
