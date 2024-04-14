/*
 * MessageDeltaContentTextObject_text.h
 *
 * 
 */

#ifndef _MessageDeltaContentTextObject_text_H_
#define _MessageDeltaContentTextObject_text_H_


#include <string>
#include "MessageDeltaContentTextObject_text_annotations_inner.h"
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

class MessageDeltaContentTextObject_text : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentTextObject_text();
	MessageDeltaContentTextObject_text(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentTextObject_text();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The data that makes up the text.
	 */
	std::string getValue();

	/*! \brief Set The data that makes up the text.
	 */
	void setValue(std::string  value);
	/*! \brief Get 
	 */
	std::list<MessageDeltaContentTextObject_text_annotations_inner> getAnnotations();

	/*! \brief Set 
	 */
	void setAnnotations(std::list <MessageDeltaContentTextObject_text_annotations_inner> annotations);

private:
	std::string value;
	std::list <MessageDeltaContentTextObject_text_annotations_inner>annotations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaContentTextObject_text_H_ */
