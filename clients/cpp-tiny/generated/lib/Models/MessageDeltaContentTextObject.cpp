

#include "MessageDeltaContentTextObject.h"

using namespace Tiny;

MessageDeltaContentTextObject::MessageDeltaContentTextObject()
{
	index = int(0);
	type = std::string();
	text = MessageDeltaContentTextObject_text();
}

MessageDeltaContentTextObject::MessageDeltaContentTextObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentTextObject::~MessageDeltaContentTextObject()
{

}

void
MessageDeltaContentTextObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

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




        MessageDeltaContentTextObject_text* obj = &text;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageDeltaContentTextObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();







	object["text"] = getText().toJson();


    return object;

}

int
MessageDeltaContentTextObject::getIndex()
{
	return index;
}

void
MessageDeltaContentTextObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentTextObject::getType()
{
	return type;
}

void
MessageDeltaContentTextObject::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentTextObject_text
MessageDeltaContentTextObject::getText()
{
	return text;
}

void
MessageDeltaContentTextObject::setText(MessageDeltaContentTextObject_text  text)
{
	this->text = text;
}



