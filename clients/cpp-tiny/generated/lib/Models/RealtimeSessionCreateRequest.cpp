

#include "RealtimeSessionCreateRequest.h"

using namespace Tiny;

RealtimeSessionCreateRequest::RealtimeSessionCreateRequest()
{
	modalities = std::list<std::string>();
	model = std::string();
	instructions = std::string();
	voice = std::string();
	input_audio_format = std::string();
	output_audio_format = std::string();
	input_audio_transcription = RealtimeSession_input_audio_transcription();
	turn_detection = RealtimeSessionCreateRequest_turn_detection();
	tools = std::list<RealtimeResponseCreateParams_tools_inner>();
	tool_choice = std::string();
	temperature = float(0);
	max_response_output_tokens = RealtimeResponseCreateParams_max_response_output_tokens();
}

RealtimeSessionCreateRequest::RealtimeSessionCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSessionCreateRequest::~RealtimeSessionCreateRequest()
{

}

void
RealtimeSessionCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modalitiesKey = "modalities";

    if(object.has_key(modalitiesKey))
    {
        bourne::json value = object[modalitiesKey];


        std::list<std::string> modalities_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            modalities_list.push_back(element);
        }
        modalities = modalities_list;


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *instructionsKey = "instructions";

    if(object.has_key(instructionsKey))
    {
        bourne::json value = object[instructionsKey];



        jsonToValue(&instructions, value, "std::string");


    }

    const char *voiceKey = "voice";

    if(object.has_key(voiceKey))
    {
        bourne::json value = object[voiceKey];



        jsonToValue(&voice, value, "std::string");


    }

    const char *input_audio_formatKey = "input_audio_format";

    if(object.has_key(input_audio_formatKey))
    {
        bourne::json value = object[input_audio_formatKey];



        jsonToValue(&input_audio_format, value, "std::string");


    }

    const char *output_audio_formatKey = "output_audio_format";

    if(object.has_key(output_audio_formatKey))
    {
        bourne::json value = object[output_audio_formatKey];



        jsonToValue(&output_audio_format, value, "std::string");


    }

    const char *input_audio_transcriptionKey = "input_audio_transcription";

    if(object.has_key(input_audio_transcriptionKey))
    {
        bourne::json value = object[input_audio_transcriptionKey];




        RealtimeSession_input_audio_transcription* obj = &input_audio_transcription;
		obj->fromJson(value.dump());

    }

    const char *turn_detectionKey = "turn_detection";

    if(object.has_key(turn_detectionKey))
    {
        bourne::json value = object[turn_detectionKey];




        RealtimeSessionCreateRequest_turn_detection* obj = &turn_detection;
		obj->fromJson(value.dump());

    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<RealtimeResponseCreateParams_tools_inner> tools_list;
        RealtimeResponseCreateParams_tools_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }

    const char *tool_choiceKey = "tool_choice";

    if(object.has_key(tool_choiceKey))
    {
        bourne::json value = object[tool_choiceKey];



        jsonToValue(&tool_choice, value, "std::string");


    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "long");


    }

    const char *max_response_output_tokensKey = "max_response_output_tokens";

    if(object.has_key(max_response_output_tokensKey))
    {
        bourne::json value = object[max_response_output_tokensKey];




        RealtimeResponseCreateParams_max_response_output_tokens* obj = &max_response_output_tokens;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeSessionCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> modalities_list = getModalities();
    bourne::json modalities_arr = bourne::json::array();

    for(auto& var : modalities_list)
    {
        modalities_arr.append(var);
    }
    object["modalities"] = modalities_arr;









    object["model"] = getModel();






    object["instructions"] = getInstructions();






    object["voice"] = getVoice();






    object["input_audio_format"] = getInputAudioFormat();






    object["output_audio_format"] = getOutputAudioFormat();







	object["input_audio_transcription"] = getInputAudioTranscription().toJson();






	object["turn_detection"] = getTurnDetection().toJson();




    std::list<RealtimeResponseCreateParams_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        RealtimeResponseCreateParams_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;







    object["tool_choice"] = getToolChoice();






    object["temperature"] = getTemperature();







	object["max_response_output_tokens"] = getMaxResponseOutputTokens().toJson();


    return object;

}

std::list<std::string>
RealtimeSessionCreateRequest::getModalities()
{
	return modalities;
}

void
RealtimeSessionCreateRequest::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

std::string
RealtimeSessionCreateRequest::getModel()
{
	return model;
}

void
RealtimeSessionCreateRequest::setModel(std::string  model)
{
	this->model = model;
}

std::string
RealtimeSessionCreateRequest::getInstructions()
{
	return instructions;
}

void
RealtimeSessionCreateRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::string
RealtimeSessionCreateRequest::getVoice()
{
	return voice;
}

void
RealtimeSessionCreateRequest::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
RealtimeSessionCreateRequest::getInputAudioFormat()
{
	return input_audio_format;
}

void
RealtimeSessionCreateRequest::setInputAudioFormat(std::string  input_audio_format)
{
	this->input_audio_format = input_audio_format;
}

std::string
RealtimeSessionCreateRequest::getOutputAudioFormat()
{
	return output_audio_format;
}

void
RealtimeSessionCreateRequest::setOutputAudioFormat(std::string  output_audio_format)
{
	this->output_audio_format = output_audio_format;
}

RealtimeSession_input_audio_transcription
RealtimeSessionCreateRequest::getInputAudioTranscription()
{
	return input_audio_transcription;
}

void
RealtimeSessionCreateRequest::setInputAudioTranscription(RealtimeSession_input_audio_transcription  input_audio_transcription)
{
	this->input_audio_transcription = input_audio_transcription;
}

RealtimeSessionCreateRequest_turn_detection
RealtimeSessionCreateRequest::getTurnDetection()
{
	return turn_detection;
}

void
RealtimeSessionCreateRequest::setTurnDetection(RealtimeSessionCreateRequest_turn_detection  turn_detection)
{
	this->turn_detection = turn_detection;
}

std::list<RealtimeResponseCreateParams_tools_inner>
RealtimeSessionCreateRequest::getTools()
{
	return tools;
}

void
RealtimeSessionCreateRequest::setTools(std::list <RealtimeResponseCreateParams_tools_inner> tools)
{
	this->tools = tools;
}

std::string
RealtimeSessionCreateRequest::getToolChoice()
{
	return tool_choice;
}

void
RealtimeSessionCreateRequest::setToolChoice(std::string  tool_choice)
{
	this->tool_choice = tool_choice;
}

long
RealtimeSessionCreateRequest::getTemperature()
{
	return temperature;
}

void
RealtimeSessionCreateRequest::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

RealtimeResponseCreateParams_max_response_output_tokens
RealtimeSessionCreateRequest::getMaxResponseOutputTokens()
{
	return max_response_output_tokens;
}

void
RealtimeSessionCreateRequest::setMaxResponseOutputTokens(RealtimeResponseCreateParams_max_response_output_tokens  max_response_output_tokens)
{
	this->max_response_output_tokens = max_response_output_tokens;
}



