

#include "MessageDeltaContentImageFileObject.h"

using namespace Tiny;

MessageDeltaContentImageFileObject::MessageDeltaContentImageFileObject()
{
	index = int(0);
	type = std::string();
	image_file = MessageDeltaContentImageFileObject_image_file();
}

MessageDeltaContentImageFileObject::MessageDeltaContentImageFileObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentImageFileObject::~MessageDeltaContentImageFileObject()
{

}

void
MessageDeltaContentImageFileObject::fromJson(std::string jsonObj)
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

    const char *image_fileKey = "image_file";

    if(object.has_key(image_fileKey))
    {
        bourne::json value = object[image_fileKey];




        MessageDeltaContentImageFileObject_image_file* obj = &image_file;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageDeltaContentImageFileObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();







	object["image_file"] = getImageFile().toJson();


    return object;

}

int
MessageDeltaContentImageFileObject::getIndex()
{
	return index;
}

void
MessageDeltaContentImageFileObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentImageFileObject::getType()
{
	return type;
}

void
MessageDeltaContentImageFileObject::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentImageFileObject_image_file
MessageDeltaContentImageFileObject::getImageFile()
{
	return image_file;
}

void
MessageDeltaContentImageFileObject::setImageFile(MessageDeltaContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}



