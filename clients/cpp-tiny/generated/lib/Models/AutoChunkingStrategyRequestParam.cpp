

#include "AutoChunkingStrategyRequestParam.h"

using namespace Tiny;

AutoChunkingStrategyRequestParam::AutoChunkingStrategyRequestParam()
{
	type = std::string();
}

AutoChunkingStrategyRequestParam::AutoChunkingStrategyRequestParam(std::string jsonString)
{
	this->fromJson(jsonString);
}

AutoChunkingStrategyRequestParam::~AutoChunkingStrategyRequestParam()
{

}

void
AutoChunkingStrategyRequestParam::fromJson(std::string jsonObj)
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
AutoChunkingStrategyRequestParam::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
AutoChunkingStrategyRequestParam::getType()
{
	return type;
}

void
AutoChunkingStrategyRequestParam::setType(std::string  type)
{
	this->type = type;
}



