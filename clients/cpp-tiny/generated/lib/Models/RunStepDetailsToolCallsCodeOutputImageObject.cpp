

#include "RunStepDetailsToolCallsCodeOutputImageObject.h"

using namespace Tiny;

RunStepDetailsToolCallsCodeOutputImageObject::RunStepDetailsToolCallsCodeOutputImageObject()
{
	type = std::string();
	image = RunStepDetailsToolCallsCodeOutputImageObject_image();
}

RunStepDetailsToolCallsCodeOutputImageObject::RunStepDetailsToolCallsCodeOutputImageObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsCodeOutputImageObject::~RunStepDetailsToolCallsCodeOutputImageObject()
{

}

void
RunStepDetailsToolCallsCodeOutputImageObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *imageKey = "image";

    if(object.has_key(imageKey))
    {
        bourne::json value = object[imageKey];




        RunStepDetailsToolCallsCodeOutputImageObject_image* obj = &image;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDetailsToolCallsCodeOutputImageObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image"] = getImage().toJson();


    return object;

}

std::string
RunStepDetailsToolCallsCodeOutputImageObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeOutputImageObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsCodeOutputImageObject_image
RunStepDetailsToolCallsCodeOutputImageObject::getImage()
{
	return image;
}

void
RunStepDetailsToolCallsCodeOutputImageObject::setImage(RunStepDetailsToolCallsCodeOutputImageObject_image  image)
{
	this->image = image;
}



