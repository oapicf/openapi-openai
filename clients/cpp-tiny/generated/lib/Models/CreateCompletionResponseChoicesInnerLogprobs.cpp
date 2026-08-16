

#include "CreateCompletionResponse_choices_inner_logprobs.h"

using namespace Tiny;

CreateCompletionResponse_choices_inner_logprobs::CreateCompletionResponse_choices_inner_logprobs()
{
	text_offset = std::list<int>();
	token_logprobs = std::list<long>();
	tokens = std::list<std::string>();
	top_logprobs = std::list<Map>();
}

CreateCompletionResponse_choices_inner_logprobs::CreateCompletionResponse_choices_inner_logprobs(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateCompletionResponse_choices_inner_logprobs::~CreateCompletionResponse_choices_inner_logprobs()
{

}

void
CreateCompletionResponse_choices_inner_logprobs::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *text_offsetKey = "text_offset";

    if(object.has_key(text_offsetKey))
    {
        bourne::json value = object[text_offsetKey];


        std::list<int> text_offset_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            text_offset_list.push_back(element);
        }
        text_offset = text_offset_list;


    }

    const char *token_logprobsKey = "token_logprobs";

    if(object.has_key(token_logprobsKey))
    {
        bourne::json value = object[token_logprobsKey];


        std::list<long> token_logprobs_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            token_logprobs_list.push_back(element);
        }
        token_logprobs = token_logprobs_list;


    }

    const char *tokensKey = "tokens";

    if(object.has_key(tokensKey))
    {
        bourne::json value = object[tokensKey];


        std::list<std::string> tokens_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            tokens_list.push_back(element);
        }
        tokens = tokens_list;


    }

    const char *top_logprobsKey = "top_logprobs";

    if(object.has_key(top_logprobsKey))
    {
        bourne::json value = object[top_logprobsKey];


        std::list<Map> top_logprobs_list;
        Map element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "Map");


            top_logprobs_list.push_back(element);
        }
        top_logprobs = top_logprobs_list;


    }


}

bourne::json
CreateCompletionResponse_choices_inner_logprobs::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<int> text_offset_list = getTextOffset();
    bourne::json text_offset_arr = bourne::json::array();

    for(auto& var : text_offset_list)
    {
        text_offset_arr.append(var);
    }
    object["text_offset"] = text_offset_arr;








    std::list<long> token_logprobs_list = getTokenLogprobs();
    bourne::json token_logprobs_arr = bourne::json::array();

    for(auto& var : token_logprobs_list)
    {
        token_logprobs_arr.append(var);
    }
    object["token_logprobs"] = token_logprobs_arr;








    std::list<std::string> tokens_list = getTokens();
    bourne::json tokens_arr = bourne::json::array();

    for(auto& var : tokens_list)
    {
        tokens_arr.append(var);
    }
    object["tokens"] = tokens_arr;








    std::list<Map> top_logprobs_list = getTopLogprobs();
    bourne::json top_logprobs_arr = bourne::json::array();

    for(auto& var : top_logprobs_list)
    {
        top_logprobs_arr.append(var);
    }
    object["top_logprobs"] = top_logprobs_arr;






    return object;

}

std::list<int>
CreateCompletionResponse_choices_inner_logprobs::getTextOffset()
{
	return text_offset;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTextOffset(std::list <int> text_offset)
{
	this->text_offset = text_offset;
}

std::list<long>
CreateCompletionResponse_choices_inner_logprobs::getTokenLogprobs()
{
	return token_logprobs;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTokenLogprobs(std::list <long> token_logprobs)
{
	this->token_logprobs = token_logprobs;
}

std::list<std::string>
CreateCompletionResponse_choices_inner_logprobs::getTokens()
{
	return tokens;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTokens(std::list <std::string> tokens)
{
	this->tokens = tokens;
}

std::list<Map>
CreateCompletionResponse_choices_inner_logprobs::getTopLogprobs()
{
	return top_logprobs;
}

void
CreateCompletionResponse_choices_inner_logprobs::setTopLogprobs(std::list <Map> top_logprobs)
{
	this->top_logprobs = top_logprobs;
}



