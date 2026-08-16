

#include "MessageContentImageUrlObject.h"

using namespace Tiny;

MessageContentImageUrlObject::MessageContentImageUrlObject()
{
	type = std::string();
	image_url = MessageContentImageUrlObject_image_url();
}

MessageContentImageUrlObject::MessageContentImageUrlObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentImageUrlObject::~MessageContentImageUrlObject()
{

}

void
MessageContentImageUrlObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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




        MessageContentImageUrlObject_image_url* obj = &image_url;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageContentImageUrlObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image_url"] = getImageUrl().toJson();


    return object;

}

std::string
MessageContentImageUrlObject::getType()
{
	return type;
}

void
MessageContentImageUrlObject::setType(std::string  type)
{
	this->type = type;
}

MessageContentImageUrlObject_image_url
MessageContentImageUrlObject::getImageUrl()
{
	return image_url;
}

void
MessageContentImageUrlObject::setImageUrl(MessageContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}



