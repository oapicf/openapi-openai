
/*
 * FineTuneChatRequestInput.h
 *
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */

#ifndef TINY_CPP_CLIENT_FineTuneChatRequestInput_H_
#define TINY_CPP_CLIENT_FineTuneChatRequestInput_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionFunctions.h"
#include "ChatCompletionTool.h"
#include "FineTuneChatRequestInput_messages_inner.h"
#include <list>

namespace Tiny {


/*! \brief The per-line training example of a fine-tuning input file for chat models using the supervised method.
 *
 *  \ingroup Models
 *
 */

class FineTuneChatRequestInput{
public:

    /*! \brief Constructor.
	 */
    FineTuneChatRequestInput();
    FineTuneChatRequestInput(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuneChatRequestInput();


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
	/*! \brief Get A list of functions the model may generate JSON inputs for.
	 */
	std::list<ChatCompletionFunctions> getFunctions();

	/*! \brief Set A list of functions the model may generate JSON inputs for.
	 */
	void setFunctions(std::list <ChatCompletionFunctions> functions);


    private:
    std::list<FineTuneChatRequestInput_messages_inner> messages;
    std::list<ChatCompletionTool> tools;
    bool parallel_tool_calls{};
    std::list<ChatCompletionFunctions> functions;
};
}

#endif /* TINY_CPP_CLIENT_FineTuneChatRequestInput_H_ */
