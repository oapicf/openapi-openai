

#include "RealtimeServerEventResponseContentPartDone_part.h"

using namespace Tiny;

RealtimeServerEventResponseContentPartDone_part::RealtimeServerEventResponseContentPartDone_part()
{
	type = std::string();
	text = std::string();
	audio = std::string();
	transcript = std::string();
}

RealtimeServerEventResponseContentPartDone_part::RealtimeServerEventResponseContentPartDone_part(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseContentPartDone_part::~RealtimeServerEventResponseContentPartDone_part()
{

}

void
RealtimeServerEventResponseContentPartDone_part::fromJson(std::string jsonObj)
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
RealtimeServerEventResponseContentPartDone_part::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();






    object["audio"] = getAudio();






    object["transcript"] = getTranscript();



    return object;

}

std::string
RealtimeServerEventResponseContentPartDone_part::getType()
{
	return type;
}

void
RealtimeServerEventResponseContentPartDone_part::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseContentPartDone_part::getText()
{
	return text;
}

void
RealtimeServerEventResponseContentPartDone_part::setText(std::string  text)
{
	this->text = text;
}

std::string
RealtimeServerEventResponseContentPartDone_part::getAudio()
{
	return audio;
}

void
RealtimeServerEventResponseContentPartDone_part::setAudio(std::string  audio)
{
	this->audio = audio;
}

std::string
RealtimeServerEventResponseContentPartDone_part::getTranscript()
{
	return transcript;
}

void
RealtimeServerEventResponseContentPartDone_part::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}



