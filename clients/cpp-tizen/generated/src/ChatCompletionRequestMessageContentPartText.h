/*
 * ChatCompletionRequestMessageContentPartText.h
 *
 * 
 */

#ifndef _ChatCompletionRequestMessageContentPartText_H_
#define _ChatCompletionRequestMessageContentPartText_H_


#include <string>
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

class ChatCompletionRequestMessageContentPartText : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestMessageContentPartText();
	ChatCompletionRequestMessageContentPartText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestMessageContentPartText();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestMessageContentPartText_H_ */
