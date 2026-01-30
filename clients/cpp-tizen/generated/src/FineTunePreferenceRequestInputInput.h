/*
 * FineTunePreferenceRequestInput_input.h
 *
 * 
 */

#ifndef _FineTunePreferenceRequestInput_input_H_
#define _FineTunePreferenceRequestInput_input_H_


#include <string>
#include "ChatCompletionTool.h"
#include "FineTuneChatRequestInput_messages_inner.h"
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

class FineTunePreferenceRequestInput_input : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTunePreferenceRequestInput_input();
	FineTunePreferenceRequestInput_input(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTunePreferenceRequestInput_input();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	bool getParallelToolCalls();

	/*! \brief Set Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
	 */
	void setParallelToolCalls(bool  parallel_tool_calls);

private:
	std::list <FineTuneChatRequestInput_messages_inner>messages;
	std::list <ChatCompletionTool>tools;
	bool parallel_tool_calls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTunePreferenceRequestInput_input_H_ */
