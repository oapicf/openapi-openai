

#include "MessageRequestContentTextObject.h"

using namespace Tiny;

MessageRequestContentTextObject::MessageRequestContentTextObject()
{
	type = std::string();
	text = std::string();
}

MessageRequestContentTextObject::MessageRequestContentTextObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageRequestContentTextObject::~MessageRequestContentTextObject()
{

}

void
MessageRequestContentTextObject::fromJson(std::string jsonObj)
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
MessageRequestContentTextObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();



    return object;

}

std::string
MessageRequestContentTextObject::getType()
{
	return type;
}

void
MessageRequestContentTextObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageRequestContentTextObject::getText()
{
	return text;
}

void
MessageRequestContentTextObject::setText(std::string  text)
{
	this->text = text;
}



