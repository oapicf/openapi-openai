

#include "RealtimeServerEventResponseContentPartAdded_part.h"

using namespace Tiny;

RealtimeServerEventResponseContentPartAdded_part::RealtimeServerEventResponseContentPartAdded_part()
{
	type = std::string();
	text = std::string();
	audio = std::string();
	transcript = std::string();
}

RealtimeServerEventResponseContentPartAdded_part::RealtimeServerEventResponseContentPartAdded_part(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseContentPartAdded_part::~RealtimeServerEventResponseContentPartAdded_part()
{

}

void
RealtimeServerEventResponseContentPartAdded_part::fromJson(std::string jsonObj)
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
RealtimeServerEventResponseContentPartAdded_part::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();






    object["audio"] = getAudio();






    object["transcript"] = getTranscript();



    return object;

}

std::string
RealtimeServerEventResponseContentPartAdded_part::getType()
{
	return type;
}

void
RealtimeServerEventResponseContentPartAdded_part::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseContentPartAdded_part::getText()
{
	return text;
}

void
RealtimeServerEventResponseContentPartAdded_part::setText(std::string  text)
{
	this->text = text;
}

std::string
RealtimeServerEventResponseContentPartAdded_part::getAudio()
{
	return audio;
}

void
RealtimeServerEventResponseContentPartAdded_part::setAudio(std::string  audio)
{
	this->audio = audio;
}

std::string
RealtimeServerEventResponseContentPartAdded_part::getTranscript()
{
	return transcript;
}

void
RealtimeServerEventResponseContentPartAdded_part::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}



