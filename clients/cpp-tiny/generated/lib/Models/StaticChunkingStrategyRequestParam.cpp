

#include "StaticChunkingStrategyRequestParam.h"

using namespace Tiny;

StaticChunkingStrategyRequestParam::StaticChunkingStrategyRequestParam()
{
	type = std::string();
	r_static = StaticChunkingStrategy();
}

StaticChunkingStrategyRequestParam::StaticChunkingStrategyRequestParam(std::string jsonString)
{
	this->fromJson(jsonString);
}

StaticChunkingStrategyRequestParam::~StaticChunkingStrategyRequestParam()
{

}

void
StaticChunkingStrategyRequestParam::fromJson(std::string jsonObj)
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
StaticChunkingStrategyRequestParam::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["r_static"] = getRStatic().toJson();


    return object;

}

std::string
StaticChunkingStrategyRequestParam::getType()
{
	return type;
}

void
StaticChunkingStrategyRequestParam::setType(std::string  type)
{
	this->type = type;
}

StaticChunkingStrategy
StaticChunkingStrategyRequestParam::getRStatic()
{
	return r_static;
}

void
StaticChunkingStrategyRequestParam::setRStatic(StaticChunkingStrategy  r_static)
{
	this->r_static = r_static;
}



