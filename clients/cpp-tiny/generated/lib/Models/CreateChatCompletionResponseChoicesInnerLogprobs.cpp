

#include "CreateChatCompletionResponse_choices_inner_logprobs.h"

using namespace Tiny;

CreateChatCompletionResponse_choices_inner_logprobs::CreateChatCompletionResponse_choices_inner_logprobs()
{
	content = std::list<ChatCompletionTokenLogprob>();
	refusal = std::list<ChatCompletionTokenLogprob>();
}

CreateChatCompletionResponse_choices_inner_logprobs::CreateChatCompletionResponse_choices_inner_logprobs(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionResponse_choices_inner_logprobs::~CreateChatCompletionResponse_choices_inner_logprobs()
{

}

void
CreateChatCompletionResponse_choices_inner_logprobs::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];


        std::list<ChatCompletionTokenLogprob> content_list;
        ChatCompletionTokenLogprob element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            content_list.push_back(element);
        }
        content = content_list;


    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];


        std::list<ChatCompletionTokenLogprob> refusal_list;
        ChatCompletionTokenLogprob element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            refusal_list.push_back(element);
        }
        refusal = refusal_list;


    }


}

bourne::json
CreateChatCompletionResponse_choices_inner_logprobs::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ChatCompletionTokenLogprob> content_list = getContent();
    bourne::json content_arr = bourne::json::array();

    for(auto& var : content_list)
    {
        ChatCompletionTokenLogprob obj = var;
        content_arr.append(obj.toJson());
    }
    object["content"] = content_arr;






    std::list<ChatCompletionTokenLogprob> refusal_list = getRefusal();
    bourne::json refusal_arr = bourne::json::array();

    for(auto& var : refusal_list)
    {
        ChatCompletionTokenLogprob obj = var;
        refusal_arr.append(obj.toJson());
    }
    object["refusal"] = refusal_arr;




    return object;

}

std::list<ChatCompletionTokenLogprob>
CreateChatCompletionResponse_choices_inner_logprobs::getContent()
{
	return content;
}

void
CreateChatCompletionResponse_choices_inner_logprobs::setContent(std::list <ChatCompletionTokenLogprob> content)
{
	this->content = content;
}

std::list<ChatCompletionTokenLogprob>
CreateChatCompletionResponse_choices_inner_logprobs::getRefusal()
{
	return refusal;
}

void
CreateChatCompletionResponse_choices_inner_logprobs::setRefusal(std::list <ChatCompletionTokenLogprob> refusal)
{
	this->refusal = refusal;
}



