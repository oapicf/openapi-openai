

#include "ResponseFormatText.h"

using namespace Tiny;

ResponseFormatText::ResponseFormatText()
{
	type = std::string();
}

ResponseFormatText::ResponseFormatText(std::string jsonString)
{
	this->fromJson(jsonString);
}

ResponseFormatText::~ResponseFormatText()
{

}

void
ResponseFormatText::fromJson(std::string jsonObj)
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
ResponseFormatText::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
ResponseFormatText::getType()
{
	return type;
}

void
ResponseFormatText::setType(std::string  type)
{
	this->type = type;
}



