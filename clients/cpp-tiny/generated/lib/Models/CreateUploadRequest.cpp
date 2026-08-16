

#include "CreateUploadRequest.h"

using namespace Tiny;

CreateUploadRequest::CreateUploadRequest()
{
	filename = std::string();
	purpose = std::string();
	bytes = int(0);
	mime_type = std::string();
}

CreateUploadRequest::CreateUploadRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateUploadRequest::~CreateUploadRequest()
{

}

void
CreateUploadRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *filenameKey = "filename";

    if(object.has_key(filenameKey))
    {
        bourne::json value = object[filenameKey];



        jsonToValue(&filename, value, "std::string");


    }

    const char *purposeKey = "purpose";

    if(object.has_key(purposeKey))
    {
        bourne::json value = object[purposeKey];



        jsonToValue(&purpose, value, "std::string");


    }

    const char *bytesKey = "bytes";

    if(object.has_key(bytesKey))
    {
        bourne::json value = object[bytesKey];



        jsonToValue(&bytes, value, "int");


    }

    const char *mime_typeKey = "mime_type";

    if(object.has_key(mime_typeKey))
    {
        bourne::json value = object[mime_typeKey];



        jsonToValue(&mime_type, value, "std::string");


    }


}

bourne::json
CreateUploadRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["filename"] = getFilename();






    object["purpose"] = getPurpose();






    object["bytes"] = getBytes();






    object["mime_type"] = getMimeType();



    return object;

}

std::string
CreateUploadRequest::getFilename()
{
	return filename;
}

void
CreateUploadRequest::setFilename(std::string  filename)
{
	this->filename = filename;
}

std::string
CreateUploadRequest::getPurpose()
{
	return purpose;
}

void
CreateUploadRequest::setPurpose(std::string  purpose)
{
	this->purpose = purpose;
}

int
CreateUploadRequest::getBytes()
{
	return bytes;
}

void
CreateUploadRequest::setBytes(int  bytes)
{
	this->bytes = bytes;
}

std::string
CreateUploadRequest::getMimeType()
{
	return mime_type;
}

void
CreateUploadRequest::setMimeType(std::string  mime_type)
{
	this->mime_type = mime_type;
}



