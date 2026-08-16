

#include "RunCompletionUsage.h"

using namespace Tiny;

RunCompletionUsage::RunCompletionUsage()
{
	completion_tokens = int(0);
	prompt_tokens = int(0);
	total_tokens = int(0);
}

RunCompletionUsage::RunCompletionUsage(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunCompletionUsage::~RunCompletionUsage()
{

}

void
RunCompletionUsage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *completion_tokensKey = "completion_tokens";

    if(object.has_key(completion_tokensKey))
    {
        bourne::json value = object[completion_tokensKey];



        jsonToValue(&completion_tokens, value, "int");


    }

    const char *prompt_tokensKey = "prompt_tokens";

    if(object.has_key(prompt_tokensKey))
    {
        bourne::json value = object[prompt_tokensKey];



        jsonToValue(&prompt_tokens, value, "int");


    }

    const char *total_tokensKey = "total_tokens";

    if(object.has_key(total_tokensKey))
    {
        bourne::json value = object[total_tokensKey];



        jsonToValue(&total_tokens, value, "int");


    }


}

bourne::json
RunCompletionUsage::toJson()
{
    bourne::json object = bourne::json::object();





    object["completion_tokens"] = getCompletionTokens();






    object["prompt_tokens"] = getPromptTokens();






    object["total_tokens"] = getTotalTokens();



    return object;

}

int
RunCompletionUsage::getCompletionTokens()
{
	return completion_tokens;
}

void
RunCompletionUsage::setCompletionTokens(int  completion_tokens)
{
	this->completion_tokens = completion_tokens;
}

int
RunCompletionUsage::getPromptTokens()
{
	return prompt_tokens;
}

void
RunCompletionUsage::setPromptTokens(int  prompt_tokens)
{
	this->prompt_tokens = prompt_tokens;
}

int
RunCompletionUsage::getTotalTokens()
{
	return total_tokens;
}

void
RunCompletionUsage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}



