/*
 * CreateRunRequest.h
 *
 * 
 */

#ifndef _CreateRunRequest_H_
#define _CreateRunRequest_H_


#include <string>
#include "AssistantObject_tools_inner.h"
#include "AssistantsApiResponseFormatOption.h"
#include "AssistantsApiToolChoiceOption.h"
#include "CreateMessageRequest.h"
#include "CreateRunRequest_model.h"
#include "TruncationObject.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateRunRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateRunRequest();
	CreateRunRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateRunRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
	 */
	std::string getAssistantId();

	/*! \brief Set The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
	 */
	void setAssistantId(std::string  assistant_id);
	/*! \brief Get 
	 */
	CreateRunRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateRunRequest_model  model);
	/*! \brief Get Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
	 */
	std::string getInstructions();

	/*! \brief Set Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
	 */
	void setInstructions(std::string  instructions);
	/*! \brief Get Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
	 */
	std::string getAdditionalInstructions();

	/*! \brief Set Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
	 */
	void setAdditionalInstructions(std::string  additional_instructions);
	/*! \brief Get Adds additional messages to the thread before creating the run.
	 */
	std::list<CreateMessageRequest> getAdditionalMessages();

	/*! \brief Set Adds additional messages to the thread before creating the run.
	 */
	void setAdditionalMessages(std::list <CreateMessageRequest> additional_messages);
	/*! \brief Get Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
	 */
	std::list<AssistantObject_tools_inner> getTools();

	/*! \brief Set Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
	 */
	void setTools(std::list <AssistantObject_tools_inner> tools);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);
	/*! \brief Get What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
	 */
	long long getTemperature();

	/*! \brief Set What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
	 */
	void setTemperature(long long  temperature);
	/*! \brief Get An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
	 */
	long long getTopP();

	/*! \brief Set An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
	 */
	void setTopP(long long  top_p);
	/*! \brief Get If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	 */
	bool getStream();

	/*! \brief Set If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	 */
	void setStream(bool  stream);
	/*! \brief Get The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
	 */
	int getMaxPromptTokens();

	/*! \brief Set The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
	 */
	void setMaxPromptTokens(int  max_prompt_tokens);
	/*! \brief Get The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
	 */
	int getMaxCompletionTokens();

	/*! \brief Set The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
	 */
	void setMaxCompletionTokens(int  max_completion_tokens);
	/*! \brief Get 
	 */
	TruncationObject getTruncationStrategy();

	/*! \brief Set 
	 */
	void setTruncationStrategy(TruncationObject  truncation_strategy);
	/*! \brief Get 
	 */
	AssistantsApiToolChoiceOption getToolChoice();

	/*! \brief Set 
	 */
	void setToolChoice(AssistantsApiToolChoiceOption  tool_choice);
	/*! \brief Get Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
	 */
	bool getParallelToolCalls();

	/*! \brief Set Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
	 */
	void setParallelToolCalls(bool  parallel_tool_calls);
	/*! \brief Get 
	 */
	AssistantsApiResponseFormatOption getResponseFormat();

	/*! \brief Set 
	 */
	void setResponseFormat(AssistantsApiResponseFormatOption  response_format);

private:
	std::string assistant_id;
	CreateRunRequest_model model;
	std::string instructions;
	std::string additional_instructions;
	std::list <CreateMessageRequest>additional_messages;
	std::list <AssistantObject_tools_inner>tools;
	std::string metadata;
	long long temperature;
	long long top_p;
	bool stream;
	int max_prompt_tokens;
	int max_completion_tokens;
	TruncationObject truncation_strategy;
	AssistantsApiToolChoiceOption tool_choice;
	bool parallel_tool_calls;
	AssistantsApiResponseFormatOption response_format;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateRunRequest_H_ */
