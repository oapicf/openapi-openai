
/*
 * ChatCompletionRequestMessageContentPartText.h
 *
 * Learn about [text inputs](/docs/guides/text-generation). 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartText_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartText_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Learn about [text inputs](/docs/guides/text-generation). 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartText{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestMessageContentPartText();
    ChatCompletionRequestMessageContentPartText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestMessageContentPartText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the content part.
	 */
	std::string getType();

	/*! \brief Set The type of the content part.
	 */
	void setType(std::string  type);
	/*! \brief Get The text content.
	 */
	std::string getText();

	/*! \brief Set The text content.
	 */
	void setText(std::string  text);


    private:
    std::string type{};
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartText_H_ */
