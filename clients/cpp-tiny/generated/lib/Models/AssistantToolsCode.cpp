

#include "AssistantToolsCode.h"

using namespace Tiny;

AssistantToolsCode::AssistantToolsCode()
{
	type = std::string();
}

AssistantToolsCode::AssistantToolsCode(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssistantToolsCode::~AssistantToolsCode()
{

}

void
AssistantToolsCode::fromJson(std::string jsonObj)
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
AssistantToolsCode::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
AssistantToolsCode::getType()
{
	return type;
}

void
AssistantToolsCode::setType(std::string  type)
{
	this->type = type;
}



