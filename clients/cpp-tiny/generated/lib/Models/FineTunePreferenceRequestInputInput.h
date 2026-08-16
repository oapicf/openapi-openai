
/*
 * FineTunePreferenceRequestInput_input.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_FineTunePreferenceRequestInput_input_H_
#define TINY_CPP_CLIENT_FineTunePreferenceRequestInput_input_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionTool.h"
#include "FineTuneChatRequestInput_messages_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class FineTunePreferenceRequestInput_input{
public:

    /*! \brief Constructor.
	 */
    FineTunePreferenceRequestInput_input();
    FineTunePreferenceRequestInput_input(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTunePreferenceRequestInput_input();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<FineTuneChatRequestInput_messages_inner> getMessages();

	/*! \brief Set 
	 */
	void setMessages(std::list <FineTuneChatRequestInput_messages_inner> messages);
	/*! \brief Get A list of tools the model may generate JSON inputs for.
	 */
	std::list<ChatCompletionTool> getTools();

	/*! \brief Set A list of tools the model may generate JSON inputs for.
	 */
	void setTools(std::list <ChatCompletionTool> tools);
	/*! \brief Get Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
	 */
	bool isParallelToolCalls();

	/*! \brief Set Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
	 */
	void setParallelToolCalls(bool  parallel_tool_calls);


    private:
    std::list<FineTuneChatRequestInput_messages_inner> messages;
    std::list<ChatCompletionTool> tools;
    bool parallel_tool_calls{};
};
}

#endif /* TINY_CPP_CLIENT_FineTunePreferenceRequestInput_input_H_ */
