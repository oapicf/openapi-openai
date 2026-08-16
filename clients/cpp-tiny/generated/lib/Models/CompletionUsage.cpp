

#include "CompletionUsage.h"

using namespace Tiny;

CompletionUsage::CompletionUsage()
{
	completion_tokens = int(0);
	prompt_tokens = int(0);
	total_tokens = int(0);
	completion_tokens_details = CompletionUsage_completion_tokens_details();
	prompt_tokens_details = CompletionUsage_prompt_tokens_details();
}

CompletionUsage::CompletionUsage(std::string jsonString)
{
	this->fromJson(jsonString);
}

CompletionUsage::~CompletionUsage()
{

}

void
CompletionUsage::fromJson(std::string jsonObj)
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

    const char *completion_tokens_detailsKey = "completion_tokens_details";

    if(object.has_key(completion_tokens_detailsKey))
    {
        bourne::json value = object[completion_tokens_detailsKey];




        CompletionUsage_completion_tokens_details* obj = &completion_tokens_details;
		obj->fromJson(value.dump());

    }

    const char *prompt_tokens_detailsKey = "prompt_tokens_details";

    if(object.has_key(prompt_tokens_detailsKey))
    {
        bourne::json value = object[prompt_tokens_detailsKey];




        CompletionUsage_prompt_tokens_details* obj = &prompt_tokens_details;
		obj->fromJson(value.dump());

    }


}

bourne::json
CompletionUsage::toJson()
{
    bourne::json object = bourne::json::object();





    object["completion_tokens"] = getCompletionTokens();






    object["prompt_tokens"] = getPromptTokens();






    object["total_tokens"] = getTotalTokens();







	object["completion_tokens_details"] = getCompletionTokensDetails().toJson();






	object["prompt_tokens_details"] = getPromptTokensDetails().toJson();


    return object;

}

int
CompletionUsage::getCompletionTokens()
{
	return completion_tokens;
}

void
CompletionUsage::setCompletionTokens(int  completion_tokens)
{
	this->completion_tokens = completion_tokens;
}

int
CompletionUsage::getPromptTokens()
{
	return prompt_tokens;
}

void
CompletionUsage::setPromptTokens(int  prompt_tokens)
{
	this->prompt_tokens = prompt_tokens;
}

int
CompletionUsage::getTotalTokens()
{
	return total_tokens;
}

void
CompletionUsage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}

CompletionUsage_completion_tokens_details
CompletionUsage::getCompletionTokensDetails()
{
	return completion_tokens_details;
}

void
CompletionUsage::setCompletionTokensDetails(CompletionUsage_completion_tokens_details  completion_tokens_details)
{
	this->completion_tokens_details = completion_tokens_details;
}

CompletionUsage_prompt_tokens_details
CompletionUsage::getPromptTokensDetails()
{
	return prompt_tokens_details;
}

void
CompletionUsage::setPromptTokensDetails(CompletionUsage_prompt_tokens_details  prompt_tokens_details)
{
	this->prompt_tokens_details = prompt_tokens_details;
}



