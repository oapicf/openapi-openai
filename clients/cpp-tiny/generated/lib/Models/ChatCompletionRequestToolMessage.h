
/*
 * ChatCompletionRequestToolMessage.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestToolMessage_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestToolMessage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestToolMessage_content.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestToolMessage{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestToolMessage();
    ChatCompletionRequestToolMessage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestToolMessage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The role of the messages author, in this case `tool`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author, in this case `tool`.
	 */
	void setRole(std::string  role);
	/*! \brief Get 
	 */
	ChatCompletionRequestToolMessage_content getContent();

	/*! \brief Set 
	 */
	void setContent(ChatCompletionRequestToolMessage_content  content);
	/*! \brief Get Tool call that this message is responding to.
	 */
	std::string getToolCallId();

	/*! \brief Set Tool call that this message is responding to.
	 */
	void setToolCallId(std::string  tool_call_id);


    private:
    std::string role{};
    ChatCompletionRequestToolMessage_content content;
    std::string tool_call_id{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestToolMessage_H_ */
