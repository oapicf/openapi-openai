

#include "MessageDeltaContentImageUrlObject.h"

using namespace Tiny;

MessageDeltaContentImageUrlObject::MessageDeltaContentImageUrlObject()
{
	index = int(0);
	type = std::string();
	image_url = MessageDeltaContentImageUrlObject_image_url();
}

MessageDeltaContentImageUrlObject::MessageDeltaContentImageUrlObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentImageUrlObject::~MessageDeltaContentImageUrlObject()
{

}

void
MessageDeltaContentImageUrlObject::fromJson(std::string jsonObj)
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

    const char *image_urlKey = "image_url";

    if(object.has_key(image_urlKey))
    {
        bourne::json value = object[image_urlKey];




        MessageDeltaContentImageUrlObject_image_url* obj = &image_url;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageDeltaContentImageUrlObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();







	object["image_url"] = getImageUrl().toJson();


    return object;

}

int
MessageDeltaContentImageUrlObject::getIndex()
{
	return index;
}

void
MessageDeltaContentImageUrlObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentImageUrlObject::getType()
{
	return type;
}

void
MessageDeltaContentImageUrlObject::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentImageUrlObject_image_url
MessageDeltaContentImageUrlObject::getImageUrl()
{
	return image_url;
}

void
MessageDeltaContentImageUrlObject::setImageUrl(MessageDeltaContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}



