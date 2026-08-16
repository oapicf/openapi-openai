

#include "ChatCompletionRequestSystemMessage.h"

using namespace Tiny;

ChatCompletionRequestSystemMessage::ChatCompletionRequestSystemMessage()
{
	content = ChatCompletionRequestSystemMessage_content();
	role = std::string();
	name = std::string();
}

ChatCompletionRequestSystemMessage::ChatCompletionRequestSystemMessage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestSystemMessage::~ChatCompletionRequestSystemMessage()
{

}

void
ChatCompletionRequestSystemMessage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];




        ChatCompletionRequestSystemMessage_content* obj = &content;
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
ChatCompletionRequestSystemMessage::toJson()
{
    bourne::json object = bourne::json::object();






	object["content"] = getContent().toJson();





    object["role"] = getRole();






    object["name"] = getName();



    return object;

}

ChatCompletionRequestSystemMessage_content
ChatCompletionRequestSystemMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestSystemMessage::setContent(ChatCompletionRequestSystemMessage_content  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestSystemMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestSystemMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestSystemMessage::getName()
{
	return name;
}

void
ChatCompletionRequestSystemMessage::setName(std::string  name)
{
	this->name = name;
}



