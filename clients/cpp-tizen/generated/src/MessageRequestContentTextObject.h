/*
 * MessageRequestContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef _MessageRequestContentTextObject_H_
#define _MessageRequestContentTextObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The text content that is part of a message.
 *
 *  \ingroup Models
 *
 */

class MessageRequestContentTextObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageRequestContentTextObject();
	MessageRequestContentTextObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageRequestContentTextObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `text`.
	 */
	std::string getType();

	/*! \brief Set Always `text`.
	 */
	void setType(std::string  type);
	/*! \brief Get Text content to be sent to the model
	 */
	std::string getText();

	/*! \brief Set Text content to be sent to the model
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

#endif /* _MessageRequestContentTextObject_H_ */
