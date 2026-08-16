

#include "MessageContentTextAnnotationsFileCitationObject_file_citation.h"

using namespace Tiny;

MessageContentTextAnnotationsFileCitationObject_file_citation::MessageContentTextAnnotationsFileCitationObject_file_citation()
{
	file_id = std::string();
}

MessageContentTextAnnotationsFileCitationObject_file_citation::MessageContentTextAnnotationsFileCitationObject_file_citation(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentTextAnnotationsFileCitationObject_file_citation::~MessageContentTextAnnotationsFileCitationObject_file_citation()
{

}

void
MessageContentTextAnnotationsFileCitationObject_file_citation::fromJson(std::string jsonObj)
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
MessageContentTextAnnotationsFileCitationObject_file_citation::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();



    return object;

}

std::string
MessageContentTextAnnotationsFileCitationObject_file_citation::getFileId()
{
	return file_id;
}

void
MessageContentTextAnnotationsFileCitationObject_file_citation::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}



