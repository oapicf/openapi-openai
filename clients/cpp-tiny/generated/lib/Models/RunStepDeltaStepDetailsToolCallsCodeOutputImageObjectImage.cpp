

#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image()
{
	file_id = std::string();
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image()
{

}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::fromJson(std::string jsonObj)
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
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();



    return object;

}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::getFileId()
{
	return file_id;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}



