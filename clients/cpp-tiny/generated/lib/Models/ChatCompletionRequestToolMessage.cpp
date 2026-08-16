

#include "ChatCompletionRequestToolMessage.h"

using namespace Tiny;

ChatCompletionRequestToolMessage::ChatCompletionRequestToolMessage()
{
	role = std::string();
	content = ChatCompletionRequestToolMessage_content();
	tool_call_id = std::string();
}

ChatCompletionRequestToolMessage::ChatCompletionRequestToolMessage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestToolMessage::~ChatCompletionRequestToolMessage()
{

}

void
ChatCompletionRequestToolMessage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];




        ChatCompletionRequestToolMessage_content* obj = &content;
		obj->fromJson(value.dump());

    }

    const char *tool_call_idKey = "tool_call_id";

    if(object.has_key(tool_call_idKey))
    {
        bourne::json value = object[tool_call_idKey];



        jsonToValue(&tool_call_id, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestToolMessage::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();







	object["content"] = getContent().toJson();





    object["tool_call_id"] = getToolCallId();



    return object;

}

std::string
ChatCompletionRequestToolMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestToolMessage::setRole(std::string  role)
{
	this->role = role;
}

ChatCompletionRequestToolMessage_content
ChatCompletionRequestToolMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestToolMessage::setContent(ChatCompletionRequestToolMessage_content  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestToolMessage::getToolCallId()
{
	return tool_call_id;
}

void
ChatCompletionRequestToolMessage::setToolCallId(std::string  tool_call_id)
{
	this->tool_call_id = tool_call_id;
}



