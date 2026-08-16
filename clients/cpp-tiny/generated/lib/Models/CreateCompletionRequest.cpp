

#include "CreateCompletionRequest.h"

using namespace Tiny;

CreateCompletionRequest::CreateCompletionRequest()
{
	model = CreateCompletionRequest_model();
	prompt = CreateCompletionRequest_prompt();
	best_of = int(0);
	echo = bool(false);
	frequency_penalty = float(0);
	logit_bias = null<int>();
	logprobs = int(0);
	max_tokens = int(0);
	n = int(0);
	presence_penalty = float(0);
	seed = int(0);
	stop = CreateCompletionRequest_stop();
	stream = bool(false);
	stream_options = ChatCompletionStreamOptions();
	suffix = std::string();
	temperature = float(0);
	top_p = float(0);
	user = std::string();
}

CreateCompletionRequest::CreateCompletionRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateCompletionRequest::~CreateCompletionRequest()
{

}

void
CreateCompletionRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateCompletionRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *promptKey = "prompt";

    if(object.has_key(promptKey))
    {
        bourne::json value = object[promptKey];




        CreateCompletionRequest_prompt* obj = &prompt;
		obj->fromJson(value.dump());

    }

    const char *best_ofKey = "best_of";

    if(object.has_key(best_ofKey))
    {
        bourne::json value = object[best_ofKey];



        jsonToValue(&best_of, value, "int");


    }

    const char *echoKey = "echo";

    if(object.has_key(echoKey))
    {
        bourne::json value = object[echoKey];



        jsonToValue(&echo, value, "bool");


    }

    const char *frequency_penaltyKey = "frequency_penalty";

    if(object.has_key(frequency_penaltyKey))
    {
        bourne::json value = object[frequency_penaltyKey];



        jsonToValue(&frequency_penalty, value, "long");


    }

    const char *logit_biasKey = "logit_bias";

    if(object.has_key(logit_biasKey))
    {
        bourne::json value = object[logit_biasKey];


    }

    const char *logprobsKey = "logprobs";

    if(object.has_key(logprobsKey))
    {
        bourne::json value = object[logprobsKey];



        jsonToValue(&logprobs, value, "int");


    }

    const char *max_tokensKey = "max_tokens";

    if(object.has_key(max_tokensKey))
    {
        bourne::json value = object[max_tokensKey];



        jsonToValue(&max_tokens, value, "int");


    }

    const char *nKey = "n";

    if(object.has_key(nKey))
    {
        bourne::json value = object[nKey];



        jsonToValue(&n, value, "int");


    }

    const char *presence_penaltyKey = "presence_penalty";

    if(object.has_key(presence_penaltyKey))
    {
        bourne::json value = object[presence_penaltyKey];



        jsonToValue(&presence_penalty, value, "long");


    }

    const char *seedKey = "seed";

    if(object.has_key(seedKey))
    {
        bourne::json value = object[seedKey];



        jsonToValue(&seed, value, "int");


    }

    const char *stopKey = "stop";

    if(object.has_key(stopKey))
    {
        bourne::json value = object[stopKey];




        CreateCompletionRequest_stop* obj = &stop;
		obj->fromJson(value.dump());

    }

    const char *streamKey = "stream";

    if(object.has_key(streamKey))
    {
        bourne::json value = object[streamKey];



        jsonToValue(&stream, value, "bool");


    }

    const char *stream_optionsKey = "stream_options";

    if(object.has_key(stream_optionsKey))
    {
        bourne::json value = object[stream_optionsKey];




        ChatCompletionStreamOptions* obj = &stream_options;
		obj->fromJson(value.dump());

    }

    const char *suffixKey = "suffix";

    if(object.has_key(suffixKey))
    {
        bourne::json value = object[suffixKey];



        jsonToValue(&suffix, value, "std::string");


    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "long");


    }

    const char *top_pKey = "top_p";

    if(object.has_key(top_pKey))
    {
        bourne::json value = object[top_pKey];



        jsonToValue(&top_p, value, "long");


    }

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];



        jsonToValue(&user, value, "std::string");


    }


}

bourne::json
CreateCompletionRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["model"] = getModel().toJson();






	object["prompt"] = getPrompt().toJson();





    object["best_of"] = getBestOf();






    object["echo"] = isEcho();






    object["frequency_penalty"] = getFrequencyPenalty();









    object["logprobs"] = getLogprobs();






    object["max_tokens"] = getMaxTokens();






    object["n"] = getN();






    object["presence_penalty"] = getPresencePenalty();






    object["seed"] = getSeed();







	object["stop"] = getStop().toJson();





    object["stream"] = isStream();







	object["stream_options"] = getStreamOptions().toJson();





    object["suffix"] = getSuffix();






    object["temperature"] = getTemperature();






    object["top_p"] = getTopP();






    object["user"] = getUser();



    return object;

}

CreateCompletionRequest_model
CreateCompletionRequest::getModel()
{
	return model;
}

void
CreateCompletionRequest::setModel(CreateCompletionRequest_model  model)
{
	this->model = model;
}

CreateCompletionRequest_prompt
CreateCompletionRequest::getPrompt()
{
	return prompt;
}

void
CreateCompletionRequest::setPrompt(CreateCompletionRequest_prompt  prompt)
{
	this->prompt = prompt;
}

int
CreateCompletionRequest::getBestOf()
{
	return best_of;
}

void
CreateCompletionRequest::setBestOf(int  best_of)
{
	this->best_of = best_of;
}

bool
CreateCompletionRequest::isEcho()
{
	return echo;
}

void
CreateCompletionRequest::setEcho(bool  echo)
{
	this->echo = echo;
}

long
CreateCompletionRequest::getFrequencyPenalty()
{
	return frequency_penalty;
}

void
CreateCompletionRequest::setFrequencyPenalty(long  frequency_penalty)
{
	this->frequency_penalty = frequency_penalty;
}

Map<string, string>
CreateCompletionRequest::getLogitBias()
{
	return logit_bias;
}

void
CreateCompletionRequest::setLogitBias(Map <string, string> logit_bias)
{
	this->logit_bias = logit_bias;
}

int
CreateCompletionRequest::getLogprobs()
{
	return logprobs;
}

void
CreateCompletionRequest::setLogprobs(int  logprobs)
{
	this->logprobs = logprobs;
}

int
CreateCompletionRequest::getMaxTokens()
{
	return max_tokens;
}

void
CreateCompletionRequest::setMaxTokens(int  max_tokens)
{
	this->max_tokens = max_tokens;
}

int
CreateCompletionRequest::getN()
{
	return n;
}

void
CreateCompletionRequest::setN(int  n)
{
	this->n = n;
}

long
CreateCompletionRequest::getPresencePenalty()
{
	return presence_penalty;
}

void
CreateCompletionRequest::setPresencePenalty(long  presence_penalty)
{
	this->presence_penalty = presence_penalty;
}

int
CreateCompletionRequest::getSeed()
{
	return seed;
}

void
CreateCompletionRequest::setSeed(int  seed)
{
	this->seed = seed;
}

CreateCompletionRequest_stop
CreateCompletionRequest::getStop()
{
	return stop;
}

void
CreateCompletionRequest::setStop(CreateCompletionRequest_stop  stop)
{
	this->stop = stop;
}

bool
CreateCompletionRequest::isStream()
{
	return stream;
}

void
CreateCompletionRequest::setStream(bool  stream)
{
	this->stream = stream;
}

ChatCompletionStreamOptions
CreateCompletionRequest::getStreamOptions()
{
	return stream_options;
}

void
CreateCompletionRequest::setStreamOptions(ChatCompletionStreamOptions  stream_options)
{
	this->stream_options = stream_options;
}

std::string
CreateCompletionRequest::getSuffix()
{
	return suffix;
}

void
CreateCompletionRequest::setSuffix(std::string  suffix)
{
	this->suffix = suffix;
}

long
CreateCompletionRequest::getTemperature()
{
	return temperature;
}

void
CreateCompletionRequest::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
CreateCompletionRequest::getTopP()
{
	return top_p;
}

void
CreateCompletionRequest::setTopP(long  top_p)
{
	this->top_p = top_p;
}

std::string
CreateCompletionRequest::getUser()
{
	return user;
}

void
CreateCompletionRequest::setUser(std::string  user)
{
	this->user = user;
}



