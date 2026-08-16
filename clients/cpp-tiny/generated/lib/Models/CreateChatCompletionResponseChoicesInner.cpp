

#include "CreateChatCompletionResponse_choices_inner.h"

using namespace Tiny;

CreateChatCompletionResponse_choices_inner::CreateChatCompletionResponse_choices_inner()
{
	finish_reason = std::string();
	index = int(0);
	message = ChatCompletionResponseMessage();
	logprobs = CreateChatCompletionResponse_choices_inner_logprobs();
}

CreateChatCompletionResponse_choices_inner::CreateChatCompletionResponse_choices_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionResponse_choices_inner::~CreateChatCompletionResponse_choices_inner()
{

}

void
CreateChatCompletionResponse_choices_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *finish_reasonKey = "finish_reason";

    if(object.has_key(finish_reasonKey))
    {
        bourne::json value = object[finish_reasonKey];



        jsonToValue(&finish_reason, value, "std::string");


    }

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];




        ChatCompletionResponseMessage* obj = &message;
		obj->fromJson(value.dump());

    }

    const char *logprobsKey = "logprobs";

    if(object.has_key(logprobsKey))
    {
        bourne::json value = object[logprobsKey];




        CreateChatCompletionResponse_choices_inner_logprobs* obj = &logprobs;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateChatCompletionResponse_choices_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["finish_reason"] = getFinishReason();






    object["index"] = getIndex();







	object["message"] = getMessage().toJson();






	object["logprobs"] = getLogprobs().toJson();


    return object;

}

std::string
CreateChatCompletionResponse_choices_inner::getFinishReason()
{
	return finish_reason;
}

void
CreateChatCompletionResponse_choices_inner::setFinishReason(std::string  finish_reason)
{
	this->finish_reason = finish_reason;
}

int
CreateChatCompletionResponse_choices_inner::getIndex()
{
	return index;
}

void
CreateChatCompletionResponse_choices_inner::setIndex(int  index)
{
	this->index = index;
}

ChatCompletionResponseMessage
CreateChatCompletionResponse_choices_inner::getMessage()
{
	return message;
}

void
CreateChatCompletionResponse_choices_inner::setMessage(ChatCompletionResponseMessage  message)
{
	this->message = message;
}

CreateChatCompletionResponse_choices_inner_logprobs
CreateChatCompletionResponse_choices_inner::getLogprobs()
{
	return logprobs;
}

void
CreateChatCompletionResponse_choices_inner::setLogprobs(CreateChatCompletionResponse_choices_inner_logprobs  logprobs)
{
	this->logprobs = logprobs;
}



