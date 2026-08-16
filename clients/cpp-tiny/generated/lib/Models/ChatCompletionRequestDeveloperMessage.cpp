

#include "ChatCompletionRequestDeveloperMessage.h"

using namespace Tiny;

ChatCompletionRequestDeveloperMessage::ChatCompletionRequestDeveloperMessage()
{
	content = ChatCompletionRequestDeveloperMessage_content();
	role = std::string();
	name = std::string();
}

ChatCompletionRequestDeveloperMessage::ChatCompletionRequestDeveloperMessage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestDeveloperMessage::~ChatCompletionRequestDeveloperMessage()
{

}

void
ChatCompletionRequestDeveloperMessage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];




        ChatCompletionRequestDeveloperMessage_content* obj = &content;
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
ChatCompletionRequestDeveloperMessage::toJson()
{
    bourne::json object = bourne::json::object();






	object["content"] = getContent().toJson();





    object["role"] = getRole();






    object["name"] = getName();



    return object;

}

ChatCompletionRequestDeveloperMessage_content
ChatCompletionRequestDeveloperMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestDeveloperMessage::setContent(ChatCompletionRequestDeveloperMessage_content  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestDeveloperMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestDeveloperMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestDeveloperMessage::getName()
{
	return name;
}

void
ChatCompletionRequestDeveloperMessage::setName(std::string  name)
{
	this->name = name;
}



