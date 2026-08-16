

#include "ChatCompletionRequestUserMessage.h"

using namespace Tiny;

ChatCompletionRequestUserMessage::ChatCompletionRequestUserMessage()
{
	content = ChatCompletionRequestUserMessage_content();
	role = std::string();
	name = std::string();
}

ChatCompletionRequestUserMessage::ChatCompletionRequestUserMessage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestUserMessage::~ChatCompletionRequestUserMessage()
{

}

void
ChatCompletionRequestUserMessage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];




        ChatCompletionRequestUserMessage_content* obj = &content;
		obj->fromJson(value.dump());

    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestUserMessage::toJson()
{
    bourne::json object = bourne::json::object();






	object["content"] = getContent().toJson();





    object["role"] = getRole();






    object["name"] = getName();



    return object;

}

ChatCompletionRequestUserMessage_content
ChatCompletionRequestUserMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestUserMessage::setContent(ChatCompletionRequestUserMessage_content  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestUserMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestUserMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestUserMessage::getName()
{
	return name;
}

void
ChatCompletionRequestUserMessage::setName(std::string  name)
{
	this->name = name;
}



