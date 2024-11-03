/*
 * MessageContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef _MessageContentTextObject_H_
#define _MessageContentTextObject_H_


#include <string>
#include "MessageContentTextObject_text.h"
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

class MessageContentTextObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageContentTextObject();
	MessageContentTextObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageContentTextObject();

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
	/*! \brief Get 
	 */
	MessageContentTextObject_text getText();

	/*! \brief Set 
	 */
	void setText(MessageContentTextObject_text  text);

private:
	std::string type;
	MessageContentTextObject_text text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentTextObject_H_ */
