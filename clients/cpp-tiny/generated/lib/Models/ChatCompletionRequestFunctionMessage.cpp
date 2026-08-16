

#include "ChatCompletionRequestFunctionMessage.h"

using namespace Tiny;

ChatCompletionRequestFunctionMessage::ChatCompletionRequestFunctionMessage()
{
	role = std::string();
	content = std::string();
	name = std::string();
}

ChatCompletionRequestFunctionMessage::ChatCompletionRequestFunctionMessage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestFunctionMessage::~ChatCompletionRequestFunctionMessage()
{

}

void
ChatCompletionRequestFunctionMessage::fromJson(std::string jsonObj)
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



        jsonToValue(&content, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestFunctionMessage::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();






    object["content"] = getContent();






    object["name"] = getName();



    return object;

}

std::string
ChatCompletionRequestFunctionMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestFunctionMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestFunctionMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestFunctionMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestFunctionMessage::getName()
{
	return name;
}

void
ChatCompletionRequestFunctionMessage::setName(std::string  name)
{
	this->name = name;
}



