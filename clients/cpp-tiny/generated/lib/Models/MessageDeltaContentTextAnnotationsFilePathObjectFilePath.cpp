

#include "MessageDeltaContentTextAnnotationsFilePathObject_file_path.h"

using namespace Tiny;

MessageDeltaContentTextAnnotationsFilePathObject_file_path::MessageDeltaContentTextAnnotationsFilePathObject_file_path()
{
	file_id = std::string();
}

MessageDeltaContentTextAnnotationsFilePathObject_file_path::MessageDeltaContentTextAnnotationsFilePathObject_file_path(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentTextAnnotationsFilePathObject_file_path::~MessageDeltaContentTextAnnotationsFilePathObject_file_path()
{

}

void
MessageDeltaContentTextAnnotationsFilePathObject_file_path::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idKey = "file_id";

    if(object.has_key(file_idKey))
    {
        bourne::json value = object[file_idKey];



        jsonToValue(&file_id, value, "std::string");


    }


}

bourne::json
MessageDeltaContentTextAnnotationsFilePathObject_file_path::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();



    return object;

}

std::string
MessageDeltaContentTextAnnotationsFilePathObject_file_path::getFileId()
{
	return file_id;
}

void
MessageDeltaContentTextAnnotationsFilePathObject_file_path::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}



