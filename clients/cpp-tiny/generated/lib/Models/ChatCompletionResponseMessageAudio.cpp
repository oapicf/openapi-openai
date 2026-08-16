

#include "ChatCompletionResponseMessage_audio.h"

using namespace Tiny;

ChatCompletionResponseMessage_audio::ChatCompletionResponseMessage_audio()
{
	id = std::string();
	expires_at = int(0);
	data = std::string();
	transcript = std::string();
}

ChatCompletionResponseMessage_audio::ChatCompletionResponseMessage_audio(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionResponseMessage_audio::~ChatCompletionResponseMessage_audio()
{

}

void
ChatCompletionResponseMessage_audio::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }

    const char *transcriptKey = "transcript";

    if(object.has_key(transcriptKey))
    {
        bourne::json value = object[transcriptKey];



        jsonToValue(&transcript, value, "std::string");


    }


}

bourne::json
ChatCompletionResponseMessage_audio::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["expires_at"] = getExpiresAt();






    object["data"] = getData();






    object["transcript"] = getTranscript();



    return object;

}

std::string
ChatCompletionResponseMessage_audio::getId()
{
	return id;
}

void
ChatCompletionResponseMessage_audio::setId(std::string  id)
{
	this->id = id;
}

int
ChatCompletionResponseMessage_audio::getExpiresAt()
{
	return expires_at;
}

void
ChatCompletionResponseMessage_audio::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

std::string
ChatCompletionResponseMessage_audio::getData()
{
	return data;
}

void
ChatCompletionResponseMessage_audio::setData(std::string  data)
{
	this->data = data;
}

std::string
ChatCompletionResponseMessage_audio::getTranscript()
{
	return transcript;
}

void
ChatCompletionResponseMessage_audio::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}



