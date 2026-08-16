

#include "AssistantToolsFileSearchTypeOnly.h"

using namespace Tiny;

AssistantToolsFileSearchTypeOnly::AssistantToolsFileSearchTypeOnly()
{
	type = std::string();
}

AssistantToolsFileSearchTypeOnly::AssistantToolsFileSearchTypeOnly(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantToolsFileSearchTypeOnly::~AssistantToolsFileSearchTypeOnly()
{

}

void
AssistantToolsFileSearchTypeOnly::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
AssistantToolsFileSearchTypeOnly::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
AssistantToolsFileSearchTypeOnly::getType()
{
	return type;
}

void
AssistantToolsFileSearchTypeOnly::setType(std::string  type)
{
	this->type = type;
}



