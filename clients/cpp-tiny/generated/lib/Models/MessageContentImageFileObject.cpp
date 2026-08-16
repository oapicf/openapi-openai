

#include "MessageContentImageFileObject.h"

using namespace Tiny;

MessageContentImageFileObject::MessageContentImageFileObject()
{
	type = std::string();
	image_file = MessageContentImageFileObject_image_file();
}

MessageContentImageFileObject::MessageContentImageFileObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentImageFileObject::~MessageContentImageFileObject()
{

}

void
MessageContentImageFileObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *image_fileKey = "image_file";

    if(object.has_key(image_fileKey))
    {
        bourne::json value = object[image_fileKey];




        MessageContentImageFileObject_image_file* obj = &image_file;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageContentImageFileObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image_file"] = getImageFile().toJson();


    return object;

}

std::string
MessageContentImageFileObject::getType()
{
	return type;
}

void
MessageContentImageFileObject::setType(std::string  type)
{
	this->type = type;
}

MessageContentImageFileObject_image_file
MessageContentImageFileObject::getImageFile()
{
	return image_file;
}

void
MessageContentImageFileObject::setImageFile(MessageContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}



