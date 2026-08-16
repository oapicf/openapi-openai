

#include "MessageContentTextObject.h"

using namespace Tiny;

MessageContentTextObject::MessageContentTextObject()
{
	type = std::string();
	text = MessageContentTextObject_text();
}

MessageContentTextObject::MessageContentTextObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentTextObject::~MessageContentTextObject()
{

}

void
MessageContentTextObject::fromJson(std::string jsonObj)
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




        MessageContentTextObject_text* obj = &text;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageContentTextObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["text"] = getText().toJson();


    return object;

}

std::string
MessageContentTextObject::getType()
{
	return type;
}

void
MessageContentTextObject::setType(std::string  type)
{
	this->type = type;
}

MessageContentTextObject_text
MessageContentTextObject::getText()
{
	return text;
}

void
MessageContentTextObject::setText(MessageContentTextObject_text  text)
{
	this->text = text;
}



