
/*
 * RunObject.h
 *
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */

#ifndef TINY_CPP_CLIENT_RunObject_H_
#define TINY_CPP_CLIENT_RunObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssistantObject_tools_inner.h"
#include "AssistantsApiResponseFormatOption.h"
#include "AssistantsApiToolChoiceOption.h"
#include "Object.h"
#include "RunCompletionUsage.h"
#include "RunObject_incomplete_details.h"
#include "RunObject_last_error.h"
#include "RunObject_required_action.h"
#include "TruncationObject.h"
#include <list>

namespace Tiny {


/*! \brief Represents an execution run on a [thread](/docs/api-reference/threads).
 *
 *  \ingroup Models
 *
 */

class RunObject{
public:

    /*! \brief Constructor.
	 */
    RunObject();
    RunObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `thread.run`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread.run`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the run was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
	 */
	std::string getThreadId();

	/*! \brief Set The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
	 */
	void setThreadId(std::string  thread_id);
	/*! \brief Get The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
	 */
	std::string getAssistantId();

	/*! \brief Set The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
	 */
	void setAssistantId(std::string  assistant_id);
	/*! \brief Get The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
	 */
	std::string getStatus();

	/*! \brief Set The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	RunObject_required_action getRequiredAction();

	/*! \brief Set 
	 */
	void setRequiredAction(RunObject_required_action  required_action);
	/*! \brief Get 
	 */
	RunObject_last_error getLastError();

	/*! \brief Set 
	 */
	void setLastError(RunObject_last_error  last_error);
	/*! \brief Get The Unix timestamp (in seconds) for when the run will expire.
	 */
	int getExpiresAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run will expire.
	 */
	void setExpiresAt(int  expires_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the run was started.
	 */
	int getStartedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run was started.
	 */
	void setStartedAt(int  started_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the run was cancelled.
	 */
	int getCancelledAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run was cancelled.
	 */
	void setCancelledAt(int  cancelled_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the run failed.
	 */
	int getFailedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run failed.
	 */
	void setFailedAt(int  failed_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the run was completed.
	 */
	int getCompletedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run was completed.
	 */
	void setCompletedAt(int  completed_at);
	/*! \brief Get 
	 */
	RunObject_incomplete_details getIncompleteDetails();

	/*! \brief Set 
	 */
	void setIncompleteDetails(RunObject_incomplete_details  incomplete_details);
	/*! \brief Get The model that the [assistant](/docs/api-reference/assistants) used for this run.
	 */
	std::string getModel();

	/*! \brief Set The model that the [assistant](/docs/api-reference/assistants) used for this run.
	 */
	void setModel(std::string  model);
	/*! \brief Get The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
	 */
	std::string getInstructions();

	/*! \brief Set The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
	 */
	void setInstructions(std::string  instructions);
	/*! \brief Get The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
	 */
	std::list<AssistantObject_tools_inner> getTools();

	/*! \brief Set The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
	 */
	void setTools(std::list <AssistantObject_tools_inner> tools);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);
	/*! \brief Get 
	 */
	RunCompletionUsage getUsage();

	/*! \brief Set 
	 */
	void setUsage(RunCompletionUsage  usage);
	/*! \brief Get The sampling temperature used for this run. If not set, defaults to 1.
	 */
	long getTemperature();

	/*! \brief Set The sampling temperature used for this run. If not set, defaults to 1.
	 */
	void setTemperature(long  temperature);
	/*! \brief Get The nucleus sampling value used for this run. If not set, defaults to 1.
	 */
	long getTopP();

	/*! \brief Set The nucleus sampling value used for this run. If not set, defaults to 1.
	 */
	void setTopP(long  top_p);
	/*! \brief Get The maximum number of prompt tokens specified to have been used over the course of the run. 
	 */
	int getMaxPromptTokens();

	/*! \brief Set The maximum number of prompt tokens specified to have been used over the course of the run. 
	 */
	void setMaxPromptTokens(int  max_prompt_tokens);
	/*! \brief Get The maximum number of completion tokens specified to have been used over the course of the run. 
	 */
	int getMaxCompletionTokens();

	/*! \brief Set The maximum number of completion tokens specified to have been used over the course of the run. 
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
	bool isParallelToolCalls();

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
    std::string id{};
    std::string object{};
    int created_at{};
    std::string thread_id{};
    std::string assistant_id{};
    std::string status{};
    RunObject_required_action required_action;
    RunObject_last_error last_error;
    int expires_at{};
    int started_at{};
    int cancelled_at{};
    int failed_at{};
    int completed_at{};
    RunObject_incomplete_details incomplete_details;
    std::string model{};
    std::string instructions{};
    std::list<AssistantObject_tools_inner> tools;
    Object metadata;
    RunCompletionUsage usage;
    long temperature{};
    long top_p{};
    int max_prompt_tokens{};
    int max_completion_tokens{};
    TruncationObject truncation_strategy;
    AssistantsApiToolChoiceOption tool_choice;
    bool parallel_tool_calls{};
    AssistantsApiResponseFormatOption response_format;
};
}

#endif /* TINY_CPP_CLIENT_RunObject_H_ */
