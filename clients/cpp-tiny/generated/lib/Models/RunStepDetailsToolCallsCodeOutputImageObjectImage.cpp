

#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"

using namespace Tiny;

RunStepDetailsToolCallsCodeOutputImageObject_image::RunStepDetailsToolCallsCodeOutputImageObject_image()
{
	file_id = std::string();
}

RunStepDetailsToolCallsCodeOutputImageObject_image::RunStepDetailsToolCallsCodeOutputImageObject_image(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsCodeOutputImageObject_image::~RunStepDetailsToolCallsCodeOutputImageObject_image()
{

}

void
RunStepDetailsToolCallsCodeOutputImageObject_image::fromJson(std::string jsonObj)
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
RunStepDetailsToolCallsCodeOutputImageObject_image::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();



    return object;

}

std::string
RunStepDetailsToolCallsCodeOutputImageObject_image::getFileId()
{
	return file_id;
}

void
RunStepDetailsToolCallsCodeOutputImageObject_image::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}



