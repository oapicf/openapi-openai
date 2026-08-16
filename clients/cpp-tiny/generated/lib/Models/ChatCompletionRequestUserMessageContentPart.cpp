

#include "ChatCompletionRequestUserMessageContentPart.h"

using namespace Tiny;

ChatCompletionRequestUserMessageContentPart::ChatCompletionRequestUserMessageContentPart()
{
	type = std::string();
	text = std::string();
	image_url = ChatCompletionRequestMessageContentPartImage_image_url();
	input_audio = ChatCompletionRequestMessageContentPartAudio_input_audio();
}

ChatCompletionRequestUserMessageContentPart::ChatCompletionRequestUserMessageContentPart(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestUserMessageContentPart::~ChatCompletionRequestUserMessageContentPart()
{

}

void
ChatCompletionRequestUserMessageContentPart::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *image_urlKey = "image_url";

    if(object.has_key(image_urlKey))
    {
        bourne::json value = object[image_urlKey];




        ChatCompletionRequestMessageContentPartImage_image_url* obj = &image_url;
		obj->fromJson(value.dump());

    }

    const char *input_audioKey = "input_audio";

    if(object.has_key(input_audioKey))
    {
        bourne::json value = object[input_audioKey];




        ChatCompletionRequestMessageContentPartAudio_input_audio* obj = &input_audio;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionRequestUserMessageContentPart::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();







	object["image_url"] = getImageUrl().toJson();






	object["input_audio"] = getInputAudio().toJson();


    return object;

}

std::string
ChatCompletionRequestUserMessageContentPart::getType()
{
	return type;
}

void
ChatCompletionRequestUserMessageContentPart::setType(std::string  type)
{
	this->type = type;
}

std::string
ChatCompletionRequestUserMessageContentPart::getText()
{
	return text;
}

void
ChatCompletionRequestUserMessageContentPart::setText(std::string  text)
{
	this->text = text;
}

ChatCompletionRequestMessageContentPartImage_image_url
ChatCompletionRequestUserMessageContentPart::getImageUrl()
{
	return image_url;
}

void
ChatCompletionRequestUserMessageContentPart::setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url  image_url)
{
	this->image_url = image_url;
}

ChatCompletionRequestMessageContentPartAudio_input_audio
ChatCompletionRequestUserMessageContentPart::getInputAudio()
{
	return input_audio;
}

void
ChatCompletionRequestUserMessageContentPart::setInputAudio(ChatCompletionRequestMessageContentPartAudio_input_audio  input_audio)
{
	this->input_audio = input_audio;
}



