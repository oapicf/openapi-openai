

#include "MessageDeltaContentImageFileObject_image_file.h"

using namespace Tiny;

MessageDeltaContentImageFileObject_image_file::MessageDeltaContentImageFileObject_image_file()
{
	file_id = std::string();
	detail = std::string();
}

MessageDeltaContentImageFileObject_image_file::MessageDeltaContentImageFileObject_image_file(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentImageFileObject_image_file::~MessageDeltaContentImageFileObject_image_file()
{

}

void
MessageDeltaContentImageFileObject_image_file::fromJson(std::string jsonObj)
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
MessageDeltaContentImageFileObject_image_file::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();






    object["detail"] = getDetail();



    return object;

}

std::string
MessageDeltaContentImageFileObject_image_file::getFileId()
{
	return file_id;
}

void
MessageDeltaContentImageFileObject_image_file::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

std::string
MessageDeltaContentImageFileObject_image_file::getDetail()
{
	return detail;
}

void
MessageDeltaContentImageFileObject_image_file::setDetail(std::string  detail)
{
	this->detail = detail;
}



