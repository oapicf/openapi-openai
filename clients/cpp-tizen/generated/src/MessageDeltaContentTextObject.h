/*
 * MessageDeltaContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef _MessageDeltaContentTextObject_H_
#define _MessageDeltaContentTextObject_H_


#include <string>
#include "MessageDeltaContentTextObject_text.h"
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

class MessageDeltaContentTextObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentTextObject();
	MessageDeltaContentTextObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentTextObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of the content part in the message.
	 */
	int getIndex();

	/*! \brief Set The index of the content part in the message.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `text`.
	 */
	std::string getType();

	/*! \brief Set Always `text`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageDeltaContentTextObject_text getText();

	/*! \brief Set 
	 */
	void setText(MessageDeltaContentTextObject_text  text);

private:
	int index;
	std::string type;
	MessageDeltaContentTextObject_text text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaContentTextObject_H_ */
