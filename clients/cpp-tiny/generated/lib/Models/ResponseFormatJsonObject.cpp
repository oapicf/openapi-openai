

#include "ResponseFormatJsonObject.h"

using namespace Tiny;

ResponseFormatJsonObject::ResponseFormatJsonObject()
{
	type = std::string();
}

ResponseFormatJsonObject::ResponseFormatJsonObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

ResponseFormatJsonObject::~ResponseFormatJsonObject()
{

}

void
ResponseFormatJsonObject::fromJson(std::string jsonObj)
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
ResponseFormatJsonObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
ResponseFormatJsonObject::getType()
{
	return type;
}

void
ResponseFormatJsonObject::setType(std::string  type)
{
	this->type = type;
}



