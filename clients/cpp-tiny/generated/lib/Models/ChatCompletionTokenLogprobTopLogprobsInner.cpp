

#include "ChatCompletionTokenLogprob_top_logprobs_inner.h"

using namespace Tiny;

ChatCompletionTokenLogprob_top_logprobs_inner::ChatCompletionTokenLogprob_top_logprobs_inner()
{
	token = std::string();
	logprob = float(0);
	bytes = std::list<int>();
}

ChatCompletionTokenLogprob_top_logprobs_inner::ChatCompletionTokenLogprob_top_logprobs_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionTokenLogprob_top_logprobs_inner::~ChatCompletionTokenLogprob_top_logprobs_inner()
{

}

void
ChatCompletionTokenLogprob_top_logprobs_inner::fromJson(std::string jsonObj)
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


}

bourne::json
ChatCompletionTokenLogprob_top_logprobs_inner::toJson()
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






    return object;

}

std::string
ChatCompletionTokenLogprob_top_logprobs_inner::getToken()
{
	return token;
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::setToken(std::string  token)
{
	this->token = token;
}

long
ChatCompletionTokenLogprob_top_logprobs_inner::getLogprob()
{
	return logprob;
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::setLogprob(long  logprob)
{
	this->logprob = logprob;
}

std::list<int>
ChatCompletionTokenLogprob_top_logprobs_inner::getBytes()
{
	return bytes;
}

void
ChatCompletionTokenLogprob_top_logprobs_inner::setBytes(std::list <int> bytes)
{
	this->bytes = bytes;
}



