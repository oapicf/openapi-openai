

#include "OpenAIFile.h"

using namespace Tiny;

OpenAIFile::OpenAIFile()
{
	id = std::string();
	bytes = int(0);
	created_at = int(0);
	filename = std::string();
	object = std::string();
	purpose = std::string();
	status = std::string();
	status_details = std::string();
}

OpenAIFile::OpenAIFile(std::string jsonString)
{
	this->fromJson(jsonString);
}

OpenAIFile::~OpenAIFile()
{

}

void
OpenAIFile::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *bytesKey = "bytes";

    if(object.has_key(bytesKey))
    {
        bourne::json value = object[bytesKey];



        jsonToValue(&bytes, value, "int");


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

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


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

    const char *status_detailsKey = "status_details";

    if(object.has_key(status_detailsKey))
    {
        bourne::json value = object[status_detailsKey];



        jsonToValue(&status_details, value, "std::string");


    }


}

bourne::json
OpenAIFile::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["bytes"] = getBytes();






    object["created_at"] = getCreatedAt();






    object["filename"] = getFilename();






    object["object"] = getObject();






    object["purpose"] = getPurpose();






    object["status"] = getStatus();






    object["status_details"] = getStatusDetails();



    return object;

}

std::string
OpenAIFile::getId()
{
	return id;
}

void
OpenAIFile::setId(std::string  id)
{
	this->id = id;
}

int
OpenAIFile::getBytes()
{
	return bytes;
}

void
OpenAIFile::setBytes(int  bytes)
{
	this->bytes = bytes;
}

int
OpenAIFile::getCreatedAt()
{
	return created_at;
}

void
OpenAIFile::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
OpenAIFile::getFilename()
{
	return filename;
}

void
OpenAIFile::setFilename(std::string  filename)
{
	this->filename = filename;
}

std::string
OpenAIFile::getObject()
{
	return object;
}

void
OpenAIFile::setObject(std::string  object)
{
	this->object = object;
}

std::string
OpenAIFile::getPurpose()
{
	return purpose;
}

void
OpenAIFile::setPurpose(std::string  purpose)
{
	this->purpose = purpose;
}

std::string
OpenAIFile::getStatus()
{
	return status;
}

void
OpenAIFile::setStatus(std::string  status)
{
	this->status = status;
}

std::string
OpenAIFile::getStatusDetails()
{
	return status_details;
}

void
OpenAIFile::setStatusDetails(std::string  status_details)
{
	this->status_details = status_details;
}



