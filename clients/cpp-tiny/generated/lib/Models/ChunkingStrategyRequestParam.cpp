

#include "ChunkingStrategyRequestParam.h"

using namespace Tiny;

ChunkingStrategyRequestParam::ChunkingStrategyRequestParam()
{
	type = std::string();
	r_static = StaticChunkingStrategy();
}

ChunkingStrategyRequestParam::ChunkingStrategyRequestParam(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChunkingStrategyRequestParam::~ChunkingStrategyRequestParam()
{

}

void
ChunkingStrategyRequestParam::fromJson(std::string jsonObj)
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
ChunkingStrategyRequestParam::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["r_static"] = getRStatic().toJson();


    return object;

}

std::string
ChunkingStrategyRequestParam::getType()
{
	return type;
}

void
ChunkingStrategyRequestParam::setType(std::string  type)
{
	this->type = type;
}

StaticChunkingStrategy
ChunkingStrategyRequestParam::getRStatic()
{
	return r_static;
}

void
ChunkingStrategyRequestParam::setRStatic(StaticChunkingStrategy  r_static)
{
	this->r_static = r_static;
}



