

#include "CreateModerationRequest_input_oneOf_inner_oneOf.h"

using namespace Tiny;

CreateModerationRequest_input_oneOf_inner_oneOf::CreateModerationRequest_input_oneOf_inner_oneOf()
{
	type = std::string();
	image_url = CreateModerationRequest_input_oneOf_inner_oneOf_image_url();
}

CreateModerationRequest_input_oneOf_inner_oneOf::CreateModerationRequest_input_oneOf_inner_oneOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationRequest_input_oneOf_inner_oneOf::~CreateModerationRequest_input_oneOf_inner_oneOf()
{

}

void
CreateModerationRequest_input_oneOf_inner_oneOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *image_urlKey = "image_url";

    if(object.has_key(image_urlKey))
    {
        bourne::json value = object[image_urlKey];




        CreateModerationRequest_input_oneOf_inner_oneOf_image_url* obj = &image_url;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateModerationRequest_input_oneOf_inner_oneOf::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image_url"] = getImageUrl().toJson();


    return object;

}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf::getType()
{
	return type;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf::setType(std::string  type)
{
	this->type = type;
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url
CreateModerationRequest_input_oneOf_inner_oneOf::getImageUrl()
{
	return image_url;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf::setImageUrl(CreateModerationRequest_input_oneOf_inner_oneOf_image_url  image_url)
{
	this->image_url = image_url;
}



