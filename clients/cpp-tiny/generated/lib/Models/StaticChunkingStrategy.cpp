

#include "Static_Chunking_Strategy.h"

using namespace Tiny;

Static_Chunking_Strategy::Static_Chunking_Strategy()
{
	type = std::string();
	r_static = Static_Chunking_Strategy_static();
}

Static_Chunking_Strategy::Static_Chunking_Strategy(std::string jsonString)
{
	this->fromJson(jsonString);
}

Static_Chunking_Strategy::~Static_Chunking_Strategy()
{

}

void
Static_Chunking_Strategy::fromJson(std::string jsonObj)
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




        Static_Chunking_Strategy_static* obj = &r_static;
		obj->fromJson(value.dump());

    }


}

bourne::json
Static_Chunking_Strategy::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["r_static"] = getRStatic().toJson();


    return object;

}

std::string
Static_Chunking_Strategy::getType()
{
	return type;
}

void
Static_Chunking_Strategy::setType(std::string  type)
{
	this->type = type;
}

Static_Chunking_Strategy_static
Static_Chunking_Strategy::getRStatic()
{
	return r_static;
}

void
Static_Chunking_Strategy::setRStatic(Static_Chunking_Strategy_static  r_static)
{
	this->r_static = r_static;
}



