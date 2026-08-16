

#include "ChatCompletionRequestMessageContentPartImage.h"

using namespace Tiny;

ChatCompletionRequestMessageContentPartImage::ChatCompletionRequestMessageContentPartImage()
{
	type = std::string();
	image_url = ChatCompletionRequestMessageContentPartImage_image_url();
}

ChatCompletionRequestMessageContentPartImage::ChatCompletionRequestMessageContentPartImage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestMessageContentPartImage::~ChatCompletionRequestMessageContentPartImage()
{

}

void
ChatCompletionRequestMessageContentPartImage::fromJson(std::string jsonObj)
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




        ChatCompletionRequestMessageContentPartImage_image_url* obj = &image_url;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionRequestMessageContentPartImage::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["image_url"] = getImageUrl().toJson();


    return object;

}

std::string
ChatCompletionRequestMessageContentPartImage::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPartImage::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionRequestMessageContentPartImage_image_url
ChatCompletionRequestMessageContentPartImage::getImageUrl()
{
	return image_url;
}

void
ChatCompletionRequestMessageContentPartImage::setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url  image_url)
{
	this->image_url = image_url;
}



