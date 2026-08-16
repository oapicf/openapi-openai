

#include "Array_of_content_parts_inner.h"

using namespace Tiny;

Array_of_content_parts_inner::Array_of_content_parts_inner()
{
	type = std::string();
	image_file = MessageContentImageFileObject_image_file();
	image_url = MessageContentImageUrlObject_image_url();
	text = std::string();
}

Array_of_content_parts_inner::Array_of_content_parts_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Array_of_content_parts_inner::~Array_of_content_parts_inner()
{

}

void
Array_of_content_parts_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *image_fileKey = "image_file";

    if(object.has_key(image_fileKey))
    {
        bourne::json value = object[image_fileKey];




        MessageContentImageFileObject_image_file* obj = &image_file;
		obj->fromJson(value.dump());

    }

    const char *image_urlKey = "image_url";

    if(object.has_key(image_urlKey))
    {
        bourne::json value = object[image_urlKey];




        MessageContentImageUrlObject_image_url* obj = &image_url;
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
Array_of_content_parts_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image_file"] = getImageFile().toJson();






	object["image_url"] = getImageUrl().toJson();





    object["text"] = getText();



    return object;

}

std::string
Array_of_content_parts_inner::getType()
{
	return type;
}

void
Array_of_content_parts_inner::setType(std::string  type)
{
	this->type = type;
}

MessageContentImageFileObject_image_file
Array_of_content_parts_inner::getImageFile()
{
	return image_file;
}

void
Array_of_content_parts_inner::setImageFile(MessageContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}

MessageContentImageUrlObject_image_url
Array_of_content_parts_inner::getImageUrl()
{
	return image_url;
}

void
Array_of_content_parts_inner::setImageUrl(MessageContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}

std::string
Array_of_content_parts_inner::getText()
{
	return text;
}

void
Array_of_content_parts_inner::setText(std::string  text)
{
	this->text = text;
}



