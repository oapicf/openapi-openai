

#include "FineTuneCompletionRequestInput.h"

using namespace Tiny;

FineTuneCompletionRequestInput::FineTuneCompletionRequestInput()
{
	prompt = std::string();
	completion = std::string();
}

FineTuneCompletionRequestInput::FineTuneCompletionRequestInput(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneCompletionRequestInput::~FineTuneCompletionRequestInput()
{

}

void
FineTuneCompletionRequestInput::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promptKey = "prompt";

    if(object.has_key(promptKey))
    {
        bourne::json value = object[promptKey];



        jsonToValue(&prompt, value, "std::string");


    }

    const char *completionKey = "completion";

    if(object.has_key(completionKey))
    {
        bourne::json value = object[completionKey];



        jsonToValue(&completion, value, "std::string");


    }


}

bourne::json
FineTuneCompletionRequestInput::toJson()
{
    bourne::json object = bourne::json::object();





    object["prompt"] = getPrompt();






    object["completion"] = getCompletion();



    return object;

}

std::string
FineTuneCompletionRequestInput::getPrompt()
{
	return prompt;
}

void
FineTuneCompletionRequestInput::setPrompt(std::string  prompt)
{
	this->prompt = prompt;
}

std::string
FineTuneCompletionRequestInput::getCompletion()
{
	return completion;
}

void
FineTuneCompletionRequestInput::setCompletion(std::string  completion)
{
	this->completion = completion;
}



