

#include "CreateChatCompletionStreamResponse_usage.h"

using namespace Tiny;

CreateChatCompletionStreamResponse_usage::CreateChatCompletionStreamResponse_usage()
{
	completion_tokens = int(0);
	prompt_tokens = int(0);
	total_tokens = int(0);
}

CreateChatCompletionStreamResponse_usage::CreateChatCompletionStreamResponse_usage(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionStreamResponse_usage::~CreateChatCompletionStreamResponse_usage()
{

}

void
CreateChatCompletionStreamResponse_usage::fromJson(std::string jsonObj)
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
CreateChatCompletionStreamResponse_usage::toJson()
{
    bourne::json object = bourne::json::object();





    object["completion_tokens"] = getCompletionTokens();






    object["prompt_tokens"] = getPromptTokens();






    object["total_tokens"] = getTotalTokens();



    return object;

}

int
CreateChatCompletionStreamResponse_usage::getCompletionTokens()
{
	return completion_tokens;
}

void
CreateChatCompletionStreamResponse_usage::setCompletionTokens(int  completion_tokens)
{
	this->completion_tokens = completion_tokens;
}

int
CreateChatCompletionStreamResponse_usage::getPromptTokens()
{
	return prompt_tokens;
}

void
CreateChatCompletionStreamResponse_usage::setPromptTokens(int  prompt_tokens)
{
	this->prompt_tokens = prompt_tokens;
}

int
CreateChatCompletionStreamResponse_usage::getTotalTokens()
{
	return total_tokens;
}

void
CreateChatCompletionStreamResponse_usage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}



