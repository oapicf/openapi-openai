

#include "UploadPart.h"

using namespace Tiny;

UploadPart::UploadPart()
{
	id = std::string();
	created_at = int(0);
	upload_id = std::string();
	object = std::string();
}

UploadPart::UploadPart(std::string jsonString)
{
	this->fromJson(jsonString);
}

UploadPart::~UploadPart()
{

}

void
UploadPart::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *upload_idKey = "upload_id";

    if(object.has_key(upload_idKey))
    {
        bourne::json value = object[upload_idKey];



        jsonToValue(&upload_id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
UploadPart::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["created_at"] = getCreatedAt();






    object["upload_id"] = getUploadId();






    object["object"] = getObject();



    return object;

}

std::string
UploadPart::getId()
{
	return id;
}

void
UploadPart::setId(std::string  id)
{
	this->id = id;
}

int
UploadPart::getCreatedAt()
{
	return created_at;
}

void
UploadPart::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
UploadPart::getUploadId()
{
	return upload_id;
}

void
UploadPart::setUploadId(std::string  upload_id)
{
	this->upload_id = upload_id;
}

std::string
UploadPart::getObject()
{
	return object;
}

void
UploadPart::setObject(std::string  object)
{
	this->object = object;
}



