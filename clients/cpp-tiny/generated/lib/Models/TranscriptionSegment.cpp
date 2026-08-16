

#include "TranscriptionSegment.h"

using namespace Tiny;

TranscriptionSegment::TranscriptionSegment()
{
	id = int(0);
	seek = int(0);
	start = float(0);
	end = float(0);
	text = std::string();
	tokens = std::list<int>();
	temperature = float(0);
	avg_logprob = float(0);
	compression_ratio = float(0);
	no_speech_prob = float(0);
}

TranscriptionSegment::TranscriptionSegment(std::string jsonString)
{
	this->fromJson(jsonString);
}

TranscriptionSegment::~TranscriptionSegment()
{

}

void
TranscriptionSegment::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *seekKey = "seek";

    if(object.has_key(seekKey))
    {
        bourne::json value = object[seekKey];



        jsonToValue(&seek, value, "int");


    }

    const char *startKey = "start";

    if(object.has_key(startKey))
    {
        bourne::json value = object[startKey];



        jsonToValue(&start, value, "float");


    }

    const char *endKey = "end";

    if(object.has_key(endKey))
    {
        bourne::json value = object[endKey];



        jsonToValue(&end, value, "float");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *tokensKey = "tokens";

    if(object.has_key(tokensKey))
    {
        bourne::json value = object[tokensKey];


        std::list<int> tokens_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            tokens_list.push_back(element);
        }
        tokens = tokens_list;


    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "float");


    }

    const char *avg_logprobKey = "avg_logprob";

    if(object.has_key(avg_logprobKey))
    {
        bourne::json value = object[avg_logprobKey];



        jsonToValue(&avg_logprob, value, "float");


    }

    const char *compression_ratioKey = "compression_ratio";

    if(object.has_key(compression_ratioKey))
    {
        bourne::json value = object[compression_ratioKey];



        jsonToValue(&compression_ratio, value, "float");


    }

    const char *no_speech_probKey = "no_speech_prob";

    if(object.has_key(no_speech_probKey))
    {
        bourne::json value = object[no_speech_probKey];



        jsonToValue(&no_speech_prob, value, "float");


    }


}

bourne::json
TranscriptionSegment::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["seek"] = getSeek();






    object["start"] = getStart();






    object["end"] = getEnd();






    object["text"] = getText();





    std::list<int> tokens_list = getTokens();
    bourne::json tokens_arr = bourne::json::array();

    for(auto& var : tokens_list)
    {
        tokens_arr.append(var);
    }
    object["tokens"] = tokens_arr;









    object["temperature"] = getTemperature();






    object["avg_logprob"] = getAvgLogprob();






    object["compression_ratio"] = getCompressionRatio();






    object["no_speech_prob"] = getNoSpeechProb();



    return object;

}

int
TranscriptionSegment::getId()
{
	return id;
}

void
TranscriptionSegment::setId(int  id)
{
	this->id = id;
}

int
TranscriptionSegment::getSeek()
{
	return seek;
}

void
TranscriptionSegment::setSeek(int  seek)
{
	this->seek = seek;
}

float
TranscriptionSegment::getStart()
{
	return start;
}

void
TranscriptionSegment::setStart(float  start)
{
	this->start = start;
}

float
TranscriptionSegment::getEnd()
{
	return end;
}

void
TranscriptionSegment::setEnd(float  end)
{
	this->end = end;
}

std::string
TranscriptionSegment::getText()
{
	return text;
}

void
TranscriptionSegment::setText(std::string  text)
{
	this->text = text;
}

std::list<int>
TranscriptionSegment::getTokens()
{
	return tokens;
}

void
TranscriptionSegment::setTokens(std::list <int> tokens)
{
	this->tokens = tokens;
}

float
TranscriptionSegment::getTemperature()
{
	return temperature;
}

void
TranscriptionSegment::setTemperature(float  temperature)
{
	this->temperature = temperature;
}

float
TranscriptionSegment::getAvgLogprob()
{
	return avg_logprob;
}

void
TranscriptionSegment::setAvgLogprob(float  avg_logprob)
{
	this->avg_logprob = avg_logprob;
}

float
TranscriptionSegment::getCompressionRatio()
{
	return compression_ratio;
}

void
TranscriptionSegment::setCompressionRatio(float  compression_ratio)
{
	this->compression_ratio = compression_ratio;
}

float
TranscriptionSegment::getNoSpeechProb()
{
	return no_speech_prob;
}

void
TranscriptionSegment::setNoSpeechProb(float  no_speech_prob)
{
	this->no_speech_prob = no_speech_prob;
}



