

#include "CreateEmbeddingResponse_usage.h"

using namespace Tiny;

CreateEmbeddingResponse_usage::CreateEmbeddingResponse_usage()
{
	prompt_tokens = int(0);
	total_tokens = int(0);
}

CreateEmbeddingResponse_usage::CreateEmbeddingResponse_usage(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateEmbeddingResponse_usage::~CreateEmbeddingResponse_usage()
{

}

void
CreateEmbeddingResponse_usage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
CreateEmbeddingResponse_usage::toJson()
{
    bourne::json object = bourne::json::object();





    object["prompt_tokens"] = getPromptTokens();






    object["total_tokens"] = getTotalTokens();



    return object;

}

int
CreateEmbeddingResponse_usage::getPromptTokens()
{
	return prompt_tokens;
}

void
CreateEmbeddingResponse_usage::setPromptTokens(int  prompt_tokens)
{
	this->prompt_tokens = prompt_tokens;
}

int
CreateEmbeddingResponse_usage::getTotalTokens()
{
	return total_tokens;
}

void
CreateEmbeddingResponse_usage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}



