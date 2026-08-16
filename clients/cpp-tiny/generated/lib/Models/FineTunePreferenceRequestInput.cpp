

#include "FineTunePreferenceRequestInput.h"

using namespace Tiny;

FineTunePreferenceRequestInput::FineTunePreferenceRequestInput()
{
	input = FineTunePreferenceRequestInput_input();
	preferred_completion = std::list<FineTunePreferenceRequestInput_preferred_completion_inner>();
	non_preferred_completion = std::list<FineTunePreferenceRequestInput_preferred_completion_inner>();
}

FineTunePreferenceRequestInput::FineTunePreferenceRequestInput(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTunePreferenceRequestInput::~FineTunePreferenceRequestInput()
{

}

void
FineTunePreferenceRequestInput::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *inputKey = "input";

    if(object.has_key(inputKey))
    {
        bourne::json value = object[inputKey];




        FineTunePreferenceRequestInput_input* obj = &input;
		obj->fromJson(value.dump());

    }

    const char *preferred_completionKey = "preferred_completion";

    if(object.has_key(preferred_completionKey))
    {
        bourne::json value = object[preferred_completionKey];


        std::list<FineTunePreferenceRequestInput_preferred_completion_inner> preferred_completion_list;
        FineTunePreferenceRequestInput_preferred_completion_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            preferred_completion_list.push_back(element);
        }
        preferred_completion = preferred_completion_list;


    }

    const char *non_preferred_completionKey = "non_preferred_completion";

    if(object.has_key(non_preferred_completionKey))
    {
        bourne::json value = object[non_preferred_completionKey];


        std::list<FineTunePreferenceRequestInput_preferred_completion_inner> non_preferred_completion_list;
        FineTunePreferenceRequestInput_preferred_completion_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            non_preferred_completion_list.push_back(element);
        }
        non_preferred_completion = non_preferred_completion_list;


    }


}

bourne::json
FineTunePreferenceRequestInput::toJson()
{
    bourne::json object = bourne::json::object();






	object["input"] = getInput().toJson();




    std::list<FineTunePreferenceRequestInput_preferred_completion_inner> preferred_completion_list = getPreferredCompletion();
    bourne::json preferred_completion_arr = bourne::json::array();

    for(auto& var : preferred_completion_list)
    {
        FineTunePreferenceRequestInput_preferred_completion_inner obj = var;
        preferred_completion_arr.append(obj.toJson());
    }
    object["preferred_completion"] = preferred_completion_arr;






    std::list<FineTunePreferenceRequestInput_preferred_completion_inner> non_preferred_completion_list = getNonPreferredCompletion();
    bourne::json non_preferred_completion_arr = bourne::json::array();

    for(auto& var : non_preferred_completion_list)
    {
        FineTunePreferenceRequestInput_preferred_completion_inner obj = var;
        non_preferred_completion_arr.append(obj.toJson());
    }
    object["non_preferred_completion"] = non_preferred_completion_arr;




    return object;

}

FineTunePreferenceRequestInput_input
FineTunePreferenceRequestInput::getInput()
{
	return input;
}

void
FineTunePreferenceRequestInput::setInput(FineTunePreferenceRequestInput_input  input)
{
	this->input = input;
}

std::list<FineTunePreferenceRequestInput_preferred_completion_inner>
FineTunePreferenceRequestInput::getPreferredCompletion()
{
	return preferred_completion;
}

void
FineTunePreferenceRequestInput::setPreferredCompletion(std::list <FineTunePreferenceRequestInput_preferred_completion_inner> preferred_completion)
{
	this->preferred_completion = preferred_completion;
}

std::list<FineTunePreferenceRequestInput_preferred_completion_inner>
FineTunePreferenceRequestInput::getNonPreferredCompletion()
{
	return non_preferred_completion;
}

void
FineTunePreferenceRequestInput::setNonPreferredCompletion(std::list <FineTunePreferenceRequestInput_preferred_completion_inner> non_preferred_completion)
{
	this->non_preferred_completion = non_preferred_completion;
}



