

#include "MessageContentImageFileObject_image_file.h"

using namespace Tiny;

MessageContentImageFileObject_image_file::MessageContentImageFileObject_image_file()
{
	file_id = std::string();
	detail = std::string();
}

MessageContentImageFileObject_image_file::MessageContentImageFileObject_image_file(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentImageFileObject_image_file::~MessageContentImageFileObject_image_file()
{

}

void
MessageContentImageFileObject_image_file::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idKey = "file_id";

    if(object.has_key(file_idKey))
    {
        bourne::json value = object[file_idKey];



        jsonToValue(&file_id, value, "std::string");


    }

    const char *detailKey = "detail";

    if(object.has_key(detailKey))
    {
        bourne::json value = object[detailKey];



        jsonToValue(&detail, value, "std::string");


    }


}

bourne::json
MessageContentImageFileObject_image_file::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();






    object["detail"] = getDetail();



    return object;

}

std::string
MessageContentImageFileObject_image_file::getFileId()
{
	return file_id;
}

void
MessageContentImageFileObject_image_file::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

std::string
MessageContentImageFileObject_image_file::getDetail()
{
	return detail;
}

void
MessageContentImageFileObject_image_file::setDetail(std::string  detail)
{
	this->detail = detail;
}



