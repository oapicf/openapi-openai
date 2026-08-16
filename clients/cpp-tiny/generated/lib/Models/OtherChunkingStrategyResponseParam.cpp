

#include "OtherChunkingStrategyResponseParam.h"

using namespace Tiny;

OtherChunkingStrategyResponseParam::OtherChunkingStrategyResponseParam()
{
	type = std::string();
}

OtherChunkingStrategyResponseParam::OtherChunkingStrategyResponseParam(std::string jsonString)
{
	this->fromJson(jsonString);
}

OtherChunkingStrategyResponseParam::~OtherChunkingStrategyResponseParam()
{

}

void
OtherChunkingStrategyResponseParam::fromJson(std::string jsonObj)
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
OtherChunkingStrategyResponseParam::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
OtherChunkingStrategyResponseParam::getType()
{
	return type;
}

void
OtherChunkingStrategyResponseParam::setType(std::string  type)
{
	this->type = type;
}



