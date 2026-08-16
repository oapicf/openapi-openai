
/*
 * ChatCompletionRequestFunctionMessage.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestFunctionMessage_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestFunctionMessage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestFunctionMessage{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestFunctionMessage();
    ChatCompletionRequestFunctionMessage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestFunctionMessage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The role of the messages author, in this case `function`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author, in this case `function`.
	 */
	void setRole(std::string  role);
	/*! \brief Get The contents of the function message.
	 */
	std::string getContent();

	/*! \brief Set The contents of the function message.
	 */
	void setContent(std::string  content);
	/*! \brief Get The name of the function to call.
	 */
	std::string getName();

	/*! \brief Set The name of the function to call.
	 */
	void setName(std::string  name);


    private:
    std::string role{};
    std::string content{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestFunctionMessage_H_ */
