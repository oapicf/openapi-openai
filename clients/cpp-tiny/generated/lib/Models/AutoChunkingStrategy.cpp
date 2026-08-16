

#include "Auto_Chunking_Strategy.h"

using namespace Tiny;

Auto_Chunking_Strategy::Auto_Chunking_Strategy()
{
	type = std::string();
}

Auto_Chunking_Strategy::Auto_Chunking_Strategy(std::string jsonString)
{
	this->fromJson(jsonString);
}

Auto_Chunking_Strategy::~Auto_Chunking_Strategy()
{

}

void
Auto_Chunking_Strategy::fromJson(std::string jsonObj)
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
Auto_Chunking_Strategy::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
Auto_Chunking_Strategy::getType()
{
	return type;
}

void
Auto_Chunking_Strategy::setType(std::string  type)
{
	this->type = type;
}



