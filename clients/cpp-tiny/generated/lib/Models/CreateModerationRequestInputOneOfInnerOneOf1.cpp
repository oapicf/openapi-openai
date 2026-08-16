

#include "CreateModerationRequest_input_oneOf_inner_oneOf_1.h"

using namespace Tiny;

CreateModerationRequest_input_oneOf_inner_oneOf_1::CreateModerationRequest_input_oneOf_inner_oneOf_1()
{
	type = std::string();
	text = std::string();
}

CreateModerationRequest_input_oneOf_inner_oneOf_1::CreateModerationRequest_input_oneOf_inner_oneOf_1(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationRequest_input_oneOf_inner_oneOf_1::~CreateModerationRequest_input_oneOf_inner_oneOf_1()
{

}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }


}

bourne::json
CreateModerationRequest_input_oneOf_inner_oneOf_1::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();



    return object;

}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf_1::getType()
{
	return type;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::setType(std::string  type)
{
	this->type = type;
}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf_1::getText()
{
	return text;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::setText(std::string  text)
{
	this->text = text;
}



