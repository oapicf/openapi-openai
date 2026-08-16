

#include "AudioResponseFormat.h"

using namespace Tiny;

AudioResponseFormat::AudioResponseFormat()
{
}

AudioResponseFormat::AudioResponseFormat(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudioResponseFormat::~AudioResponseFormat()
{

}

void
AudioResponseFormat::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudioResponseFormat::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



