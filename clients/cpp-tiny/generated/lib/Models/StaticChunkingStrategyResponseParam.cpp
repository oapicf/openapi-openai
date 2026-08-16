

#include "StaticChunkingStrategyResponseParam.h"

using namespace Tiny;

StaticChunkingStrategyResponseParam::StaticChunkingStrategyResponseParam()
{
	type = std::string();
	r_static = StaticChunkingStrategy();
}

StaticChunkingStrategyResponseParam::StaticChunkingStrategyResponseParam(std::string jsonString)
{
	this->fromJson(jsonString);
}

StaticChunkingStrategyResponseParam::~StaticChunkingStrategyResponseParam()
{

}

void
StaticChunkingStrategyResponseParam::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *r_staticKey = "static";

    if(object.has_key(r_staticKey))
    {
        bourne::json value = object[r_staticKey];




        StaticChunkingStrategy* obj = &r_static;
		obj->fromJson(value.dump());

    }


}

bourne::json
StaticChunkingStrategyResponseParam::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["r_static"] = getRStatic().toJson();


    return object;

}

std::string
StaticChunkingStrategyResponseParam::getType()
{
	return type;
}

void
StaticChunkingStrategyResponseParam::setType(std::string  type)
{
	this->type = type;
}

StaticChunkingStrategy
StaticChunkingStrategyResponseParam::getRStatic()
{
	return r_static;
}

void
StaticChunkingStrategyResponseParam::setRStatic(StaticChunkingStrategy  r_static)
{
	this->r_static = r_static;
}



