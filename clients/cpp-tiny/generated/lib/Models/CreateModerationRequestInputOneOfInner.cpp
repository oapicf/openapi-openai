

#include "CreateModerationRequest_input_oneOf_inner.h"

using namespace Tiny;

CreateModerationRequest_input_oneOf_inner::CreateModerationRequest_input_oneOf_inner()
{
	type = std::string();
	image_url = CreateModerationRequest_input_oneOf_inner_oneOf_image_url();
	text = std::string();
}

CreateModerationRequest_input_oneOf_inner::CreateModerationRequest_input_oneOf_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationRequest_input_oneOf_inner::~CreateModerationRequest_input_oneOf_inner()
{

}

void
CreateModerationRequest_input_oneOf_inner::fromJson(std::string jsonObj)
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

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }


}

bourne::json
CreateModerationRequest_input_oneOf_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image_url"] = getImageUrl().toJson();





    object["text"] = getText();



    return object;

}

std::string
CreateModerationRequest_input_oneOf_inner::getType()
{
	return type;
}

void
CreateModerationRequest_input_oneOf_inner::setType(std::string  type)
{
	this->type = type;
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url
CreateModerationRequest_input_oneOf_inner::getImageUrl()
{
	return image_url;
}

void
CreateModerationRequest_input_oneOf_inner::setImageUrl(CreateModerationRequest_input_oneOf_inner_oneOf_image_url  image_url)
{
	this->image_url = image_url;
}

std::string
CreateModerationRequest_input_oneOf_inner::getText()
{
	return text;
}

void
CreateModerationRequest_input_oneOf_inner::setText(std::string  text)
{
	this->text = text;
}



