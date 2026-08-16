

#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject()
{
	index = int(0);
	type = std::string();
	image = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject()
{

}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

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




        RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image* obj = &image;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();







	object["image"] = getImage().toJson();


    return object;

}

int
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getImage()
{
	return image;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image  image)
{
	this->image = image;
}



