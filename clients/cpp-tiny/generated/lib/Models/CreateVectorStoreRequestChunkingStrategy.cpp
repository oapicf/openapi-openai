

#include "CreateVectorStoreRequest_chunking_strategy.h"

using namespace Tiny;

CreateVectorStoreRequest_chunking_strategy::CreateVectorStoreRequest_chunking_strategy()
{
	type = std::string();
	r_static = StaticChunkingStrategy();
}

CreateVectorStoreRequest_chunking_strategy::CreateVectorStoreRequest_chunking_strategy(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateVectorStoreRequest_chunking_strategy::~CreateVectorStoreRequest_chunking_strategy()
{

}

void
CreateVectorStoreRequest_chunking_strategy::fromJson(std::string jsonObj)
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
CreateVectorStoreRequest_chunking_strategy::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["r_static"] = getRStatic().toJson();


    return object;

}

std::string
CreateVectorStoreRequest_chunking_strategy::getType()
{
	return type;
}

void
CreateVectorStoreRequest_chunking_strategy::setType(std::string  type)
{
	this->type = type;
}

StaticChunkingStrategy
CreateVectorStoreRequest_chunking_strategy::getRStatic()
{
	return r_static;
}

void
CreateVectorStoreRequest_chunking_strategy::setRStatic(StaticChunkingStrategy  r_static)
{
	this->r_static = r_static;
}



