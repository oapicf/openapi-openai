

#include "MessageObject_content_inner.h"

using namespace Tiny;

MessageObject_content_inner::MessageObject_content_inner()
{
	type = std::string();
	image_file = MessageContentImageFileObject_image_file();
	image_url = MessageContentImageUrlObject_image_url();
	text = MessageContentTextObject_text();
	refusal = std::string();
}

MessageObject_content_inner::MessageObject_content_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageObject_content_inner::~MessageObject_content_inner()
{

}

void
MessageObject_content_inner::fromJson(std::string jsonObj)
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




        MessageContentTextObject_text* obj = &text;
		obj->fromJson(value.dump());

    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


    }


}

bourne::json
MessageObject_content_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image_file"] = getImageFile().toJson();






	object["image_url"] = getImageUrl().toJson();






	object["text"] = getText().toJson();





    object["refusal"] = getRefusal();



    return object;

}

std::string
MessageObject_content_inner::getType()
{
	return type;
}

void
MessageObject_content_inner::setType(std::string  type)
{
	this->type = type;
}

MessageContentImageFileObject_image_file
MessageObject_content_inner::getImageFile()
{
	return image_file;
}

void
MessageObject_content_inner::setImageFile(MessageContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}

MessageContentImageUrlObject_image_url
MessageObject_content_inner::getImageUrl()
{
	return image_url;
}

void
MessageObject_content_inner::setImageUrl(MessageContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}

MessageContentTextObject_text
MessageObject_content_inner::getText()
{
	return text;
}

void
MessageObject_content_inner::setText(MessageContentTextObject_text  text)
{
	this->text = text;
}

std::string
MessageObject_content_inner::getRefusal()
{
	return refusal;
}

void
MessageObject_content_inner::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}



