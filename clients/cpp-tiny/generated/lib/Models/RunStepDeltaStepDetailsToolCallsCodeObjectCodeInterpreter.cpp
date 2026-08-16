

#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h"

using namespace Tiny;

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter()
{
	input = std::string();
	outputs = std::list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>();
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter()
{

}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *inputKey = "input";

    if(object.has_key(inputKey))
    {
        bourne::json value = object[inputKey];



        jsonToValue(&input, value, "std::string");


    }

    const char *outputsKey = "outputs";

    if(object.has_key(outputsKey))
    {
        bourne::json value = object[outputsKey];


        std::list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> outputs_list;
        RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            outputs_list.push_back(element);
        }
        outputs = outputs_list;


    }


}

bourne::json
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::toJson()
{
    bourne::json object = bourne::json::object();





    object["input"] = getInput();





    std::list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> outputs_list = getOutputs();
    bourne::json outputs_arr = bourne::json::array();

    for(auto& var : outputs_list)
    {
        RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner obj = var;
        outputs_arr.append(obj.toJson());
    }
    object["outputs"] = outputs_arr;




    return object;

}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::getInput()
{
	return input;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::setInput(std::string  input)
{
	this->input = input;
}

std::list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::getOutputs()
{
	return outputs;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::setOutputs(std::list <RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> outputs)
{
	this->outputs = outputs;
}



