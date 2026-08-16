

#include "Upload.h"

using namespace Tiny;

Upload::Upload()
{
	id = std::string();
	created_at = int(0);
	filename = std::string();
	bytes = int(0);
	purpose = std::string();
	status = std::string();
	expires_at = int(0);
	object = std::string();
	file = OpenAIFile();
}

Upload::Upload(std::string jsonString)
{
	this->fromJson(jsonString);
}

Upload::~Upload()
{

}

void
Upload::fromJson(std::string jsonObj)
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

    const char *filenameKey = "filename";

    if(object.has_key(filenameKey))
    {
        bourne::json value = object[filenameKey];



        jsonToValue(&filename, value, "std::string");


    }

    const char *bytesKey = "bytes";

    if(object.has_key(bytesKey))
    {
        bourne::json value = object[bytesKey];



        jsonToValue(&bytes, value, "int");


    }

    const char *purposeKey = "purpose";

    if(object.has_key(purposeKey))
    {
        bourne::json value = object[purposeKey];



        jsonToValue(&purpose, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *fileKey = "file";

    if(object.has_key(fileKey))
    {
        bourne::json value = object[fileKey];




        OpenAIFile* obj = &file;
		obj->fromJson(value.dump());

    }


}

bourne::json
Upload::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["created_at"] = getCreatedAt();






    object["filename"] = getFilename();






    object["bytes"] = getBytes();






    object["purpose"] = getPurpose();






    object["status"] = getStatus();






    object["expires_at"] = getExpiresAt();






    object["object"] = getObject();







	object["file"] = getFile().toJson();


    return object;

}

std::string
Upload::getId()
{
	return id;
}

void
Upload::setId(std::string  id)
{
	this->id = id;
}

int
Upload::getCreatedAt()
{
	return created_at;
}

void
Upload::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
Upload::getFilename()
{
	return filename;
}

void
Upload::setFilename(std::string  filename)
{
	this->filename = filename;
}

int
Upload::getBytes()
{
	return bytes;
}

void
Upload::setBytes(int  bytes)
{
	this->bytes = bytes;
}

std::string
Upload::getPurpose()
{
	return purpose;
}

void
Upload::setPurpose(std::string  purpose)
{
	this->purpose = purpose;
}

std::string
Upload::getStatus()
{
	return status;
}

void
Upload::setStatus(std::string  status)
{
	this->status = status;
}

int
Upload::getExpiresAt()
{
	return expires_at;
}

void
Upload::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

std::string
Upload::getObject()
{
	return object;
}

void
Upload::setObject(std::string  object)
{
	this->object = object;
}

OpenAIFile
Upload::getFile()
{
	return file;
}

void
Upload::setFile(OpenAIFile  file)
{
	this->file = file;
}



