

#include "ChatCompletionRequestMessageContentPartAudio_input_audio.h"

using namespace Tiny;

ChatCompletionRequestMessageContentPartAudio_input_audio::ChatCompletionRequestMessageContentPartAudio_input_audio()
{
	data = std::string();
	format = std::string();
}

ChatCompletionRequestMessageContentPartAudio_input_audio::ChatCompletionRequestMessageContentPartAudio_input_audio(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestMessageContentPartAudio_input_audio::~ChatCompletionRequestMessageContentPartAudio_input_audio()
{

}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }

    const char *formatKey = "format";

    if(object.has_key(formatKey))
    {
        bourne::json value = object[formatKey];



        jsonToValue(&format, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestMessageContentPartAudio_input_audio::toJson()
{
    bourne::json object = bourne::json::object();





    object["data"] = getData();






    object["format"] = getFormat();



    return object;

}

std::string
ChatCompletionRequestMessageContentPartAudio_input_audio::getData()
{
	return data;
}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::setData(std::string  data)
{
	this->data = data;
}

std::string
ChatCompletionRequestMessageContentPartAudio_input_audio::getFormat()
{
	return format;
}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::setFormat(std::string  format)
{
	this->format = format;
}



