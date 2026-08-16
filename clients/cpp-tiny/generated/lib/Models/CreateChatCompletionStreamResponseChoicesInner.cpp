

#include "CreateChatCompletionStreamResponse_choices_inner.h"

using namespace Tiny;

CreateChatCompletionStreamResponse_choices_inner::CreateChatCompletionStreamResponse_choices_inner()
{
	delta = ChatCompletionStreamResponseDelta();
	logprobs = CreateChatCompletionResponse_choices_inner_logprobs();
	finish_reason = std::string();
	index = int(0);
}

CreateChatCompletionStreamResponse_choices_inner::CreateChatCompletionStreamResponse_choices_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionStreamResponse_choices_inner::~CreateChatCompletionStreamResponse_choices_inner()
{

}

void
CreateChatCompletionStreamResponse_choices_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deltaKey = "delta";

    if(object.has_key(deltaKey))
    {
        bourne::json value = object[deltaKey];




        ChatCompletionStreamResponseDelta* obj = &delta;
		obj->fromJson(value.dump());

    }

    const char *logprobsKey = "logprobs";

    if(object.has_key(logprobsKey))
    {
        bourne::json value = object[logprobsKey];




        CreateChatCompletionResponse_choices_inner_logprobs* obj = &logprobs;
		obj->fromJson(value.dump());

    }

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


}

bourne::json
CreateChatCompletionStreamResponse_choices_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["delta"] = getDelta().toJson();






	object["logprobs"] = getLogprobs().toJson();





    object["finish_reason"] = getFinishReason();






    object["index"] = getIndex();



    return object;

}

ChatCompletionStreamResponseDelta
CreateChatCompletionStreamResponse_choices_inner::getDelta()
{
	return delta;
}

void
CreateChatCompletionStreamResponse_choices_inner::setDelta(ChatCompletionStreamResponseDelta  delta)
{
	this->delta = delta;
}

CreateChatCompletionResponse_choices_inner_logprobs
CreateChatCompletionStreamResponse_choices_inner::getLogprobs()
{
	return logprobs;
}

void
CreateChatCompletionStreamResponse_choices_inner::setLogprobs(CreateChatCompletionResponse_choices_inner_logprobs  logprobs)
{
	this->logprobs = logprobs;
}

std::string
CreateChatCompletionStreamResponse_choices_inner::getFinishReason()
{
	return finish_reason;
}

void
CreateChatCompletionStreamResponse_choices_inner::setFinishReason(std::string  finish_reason)
{
	this->finish_reason = finish_reason;
}

int
CreateChatCompletionStreamResponse_choices_inner::getIndex()
{
	return index;
}

void
CreateChatCompletionStreamResponse_choices_inner::setIndex(int  index)
{
	this->index = index;
}



