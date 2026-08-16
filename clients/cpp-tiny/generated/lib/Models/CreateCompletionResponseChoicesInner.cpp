

#include "CreateCompletionResponse_choices_inner.h"

using namespace Tiny;

CreateCompletionResponse_choices_inner::CreateCompletionResponse_choices_inner()
{
	finish_reason = std::string();
	index = int(0);
	logprobs = CreateCompletionResponse_choices_inner_logprobs();
	text = std::string();
}

CreateCompletionResponse_choices_inner::CreateCompletionResponse_choices_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateCompletionResponse_choices_inner::~CreateCompletionResponse_choices_inner()
{

}

void
CreateCompletionResponse_choices_inner::fromJson(std::string jsonObj)
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

    const char *logprobsKey = "logprobs";

    if(object.has_key(logprobsKey))
    {
        bourne::json value = object[logprobsKey];




        CreateCompletionResponse_choices_inner_logprobs* obj = &logprobs;
		obj->fromJson(value.dump());

    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }


}

bourne::json
CreateCompletionResponse_choices_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["finish_reason"] = getFinishReason();






    object["index"] = getIndex();







	object["logprobs"] = getLogprobs().toJson();





    object["text"] = getText();



    return object;

}

std::string
CreateCompletionResponse_choices_inner::getFinishReason()
{
	return finish_reason;
}

void
CreateCompletionResponse_choices_inner::setFinishReason(std::string  finish_reason)
{
	this->finish_reason = finish_reason;
}

int
CreateCompletionResponse_choices_inner::getIndex()
{
	return index;
}

void
CreateCompletionResponse_choices_inner::setIndex(int  index)
{
	this->index = index;
}

CreateCompletionResponse_choices_inner_logprobs
CreateCompletionResponse_choices_inner::getLogprobs()
{
	return logprobs;
}

void
CreateCompletionResponse_choices_inner::setLogprobs(CreateCompletionResponse_choices_inner_logprobs  logprobs)
{
	this->logprobs = logprobs;
}

std::string
CreateCompletionResponse_choices_inner::getText()
{
	return text;
}

void
CreateCompletionResponse_choices_inner::setText(std::string  text)
{
	this->text = text;
}



