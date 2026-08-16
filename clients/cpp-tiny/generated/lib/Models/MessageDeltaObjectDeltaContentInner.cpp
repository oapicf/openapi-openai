

#include "MessageDeltaObject_delta_content_inner.h"

using namespace Tiny;

MessageDeltaObject_delta_content_inner::MessageDeltaObject_delta_content_inner()
{
	index = int(0);
	type = std::string();
	image_file = MessageDeltaContentImageFileObject_image_file();
	text = MessageDeltaContentTextObject_text();
	refusal = std::string();
	image_url = MessageDeltaContentImageUrlObject_image_url();
}

MessageDeltaObject_delta_content_inner::MessageDeltaObject_delta_content_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaObject_delta_content_inner::~MessageDeltaObject_delta_content_inner()
{

}

void
MessageDeltaObject_delta_content_inner::fromJson(std::string jsonObj)
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

    const char *image_fileKey = "image_file";

    if(object.has_key(image_fileKey))
    {
        bourne::json value = object[image_fileKey];




        MessageDeltaContentImageFileObject_image_file* obj = &image_file;
		obj->fromJson(value.dump());

    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];




        MessageDeltaContentTextObject_text* obj = &text;
		obj->fromJson(value.dump());

    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


    }

    const char *image_urlKey = "image_url";

    if(object.has_key(image_urlKey))
    {
        bourne::json value = object[image_urlKey];




        MessageDeltaContentImageUrlObject_image_url* obj = &image_url;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageDeltaObject_delta_content_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();







	object["image_file"] = getImageFile().toJson();






	object["text"] = getText().toJson();





    object["refusal"] = getRefusal();







	object["image_url"] = getImageUrl().toJson();


    return object;

}

int
MessageDeltaObject_delta_content_inner::getIndex()
{
	return index;
}

void
MessageDeltaObject_delta_content_inner::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaObject_delta_content_inner::getType()
{
	return type;
}

void
MessageDeltaObject_delta_content_inner::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentImageFileObject_image_file
MessageDeltaObject_delta_content_inner::getImageFile()
{
	return image_file;
}

void
MessageDeltaObject_delta_content_inner::setImageFile(MessageDeltaContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}

MessageDeltaContentTextObject_text
MessageDeltaObject_delta_content_inner::getText()
{
	return text;
}

void
MessageDeltaObject_delta_content_inner::setText(MessageDeltaContentTextObject_text  text)
{
	this->text = text;
}

std::string
MessageDeltaObject_delta_content_inner::getRefusal()
{
	return refusal;
}

void
MessageDeltaObject_delta_content_inner::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}

MessageDeltaContentImageUrlObject_image_url
MessageDeltaObject_delta_content_inner::getImageUrl()
{
	return image_url;
}

void
MessageDeltaObject_delta_content_inner::setImageUrl(MessageDeltaContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}



