

#include "RealtimeConversationItem_content_inner.h"

using namespace Tiny;

RealtimeConversationItem_content_inner::RealtimeConversationItem_content_inner()
{
	type = std::string();
	text = std::string();
	id = std::string();
	audio = std::string();
	transcript = std::string();
}

RealtimeConversationItem_content_inner::RealtimeConversationItem_content_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeConversationItem_content_inner::~RealtimeConversationItem_content_inner()
{

}

void
RealtimeConversationItem_content_inner::fromJson(std::string jsonObj)
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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *audioKey = "audio";

    if(object.has_key(audioKey))
    {
        bourne::json value = object[audioKey];



        jsonToValue(&audio, value, "std::string");


    }

    const char *transcriptKey = "transcript";

    if(object.has_key(transcriptKey))
    {
        bourne::json value = object[transcriptKey];



        jsonToValue(&transcript, value, "std::string");


    }


}

bourne::json
RealtimeConversationItem_content_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();






    object["id"] = getId();






    object["audio"] = getAudio();






    object["transcript"] = getTranscript();



    return object;

}

std::string
RealtimeConversationItem_content_inner::getType()
{
	return type;
}

void
RealtimeConversationItem_content_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeConversationItem_content_inner::getText()
{
	return text;
}

void
RealtimeConversationItem_content_inner::setText(std::string  text)
{
	this->text = text;
}

std::string
RealtimeConversationItem_content_inner::getId()
{
	return id;
}

void
RealtimeConversationItem_content_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeConversationItem_content_inner::getAudio()
{
	return audio;
}

void
RealtimeConversationItem_content_inner::setAudio(std::string  audio)
{
	this->audio = audio;
}

std::string
RealtimeConversationItem_content_inner::getTranscript()
{
	return transcript;
}

void
RealtimeConversationItem_content_inner::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}



