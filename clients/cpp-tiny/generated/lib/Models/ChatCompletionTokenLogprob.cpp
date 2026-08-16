

#include "ChatCompletionTokenLogprob.h"

using namespace Tiny;

ChatCompletionTokenLogprob::ChatCompletionTokenLogprob()
{
	token = std::string();
	logprob = float(0);
	bytes = std::list<int>();
	top_logprobs = std::list<ChatCompletionTokenLogprob_top_logprobs_inner>();
}

ChatCompletionTokenLogprob::ChatCompletionTokenLogprob(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionTokenLogprob::~ChatCompletionTokenLogprob()
{

}

void
ChatCompletionTokenLogprob::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tokenKey = "token";

    if(object.has_key(tokenKey))
    {
        bourne::json value = object[tokenKey];



        jsonToValue(&token, value, "std::string");


    }

    const char *logprobKey = "logprob";

    if(object.has_key(logprobKey))
    {
        bourne::json value = object[logprobKey];



        jsonToValue(&logprob, value, "long");


    }

    const char *bytesKey = "bytes";

    if(object.has_key(bytesKey))
    {
        bourne::json value = object[bytesKey];


        std::list<int> bytes_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            bytes_list.push_back(element);
        }
        bytes = bytes_list;


    }

    const char *top_logprobsKey = "top_logprobs";

    if(object.has_key(top_logprobsKey))
    {
        bourne::json value = object[top_logprobsKey];


        std::list<ChatCompletionTokenLogprob_top_logprobs_inner> top_logprobs_list;
        ChatCompletionTokenLogprob_top_logprobs_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            top_logprobs_list.push_back(element);
        }
        top_logprobs = top_logprobs_list;


    }


}

bourne::json
ChatCompletionTokenLogprob::toJson()
{
    bourne::json object = bourne::json::object();





    object["token"] = getToken();






    object["logprob"] = getLogprob();





    std::list<int> bytes_list = getBytes();
    bourne::json bytes_arr = bourne::json::array();

    for(auto& var : bytes_list)
    {
        bytes_arr.append(var);
    }
    object["bytes"] = bytes_arr;








    std::list<ChatCompletionTokenLogprob_top_logprobs_inner> top_logprobs_list = getTopLogprobs();
    bourne::json top_logprobs_arr = bourne::json::array();

    for(auto& var : top_logprobs_list)
    {
        ChatCompletionTokenLogprob_top_logprobs_inner obj = var;
        top_logprobs_arr.append(obj.toJson());
    }
    object["top_logprobs"] = top_logprobs_arr;




    return object;

}

std::string
ChatCompletionTokenLogprob::getToken()
{
	return token;
}

void
ChatCompletionTokenLogprob::setToken(std::string  token)
{
	this->token = token;
}

long
ChatCompletionTokenLogprob::getLogprob()
{
	return logprob;
}

void
ChatCompletionTokenLogprob::setLogprob(long  logprob)
{
	this->logprob = logprob;
}

std::list<int>
ChatCompletionTokenLogprob::getBytes()
{
	return bytes;
}

void
ChatCompletionTokenLogprob::setBytes(std::list <int> bytes)
{
	this->bytes = bytes;
}

std::list<ChatCompletionTokenLogprob_top_logprobs_inner>
ChatCompletionTokenLogprob::getTopLogprobs()
{
	return top_logprobs;
}

void
ChatCompletionTokenLogprob::setTopLogprobs(std::list <ChatCompletionTokenLogprob_top_logprobs_inner> top_logprobs)
{
	this->top_logprobs = top_logprobs;
}



